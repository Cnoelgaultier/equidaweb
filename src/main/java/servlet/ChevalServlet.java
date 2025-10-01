package servlet;

import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import database.DaoCheval;
import database.DaoRace;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.Cheval;
import model.Race;
import java.time.LocalDate;
import model.Participer;

@WebServlet(name = "chevalServlet", value = "/cheval-servlet/*")
public class ChevalServlet extends HttpServlet {

    Connection cnx;
    
    @Override
    public void init() {
        ServletContext servletContext = getServletContext();
        cnx = (Connection)servletContext.getAttribute("connection");
        try {
            System.out.println("INIT SERVLET=" + cnx.getSchema());
        } catch (SQLException ex) {
            Logger.getLogger(ChevalServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String path = request.getPathInfo();
        System.out.println("PathInfo: " + path);

        if ("/list".equals(path)) {
            ArrayList<Cheval> lesChevaux = DaoCheval.getLesChevaux(cnx);
            request.setAttribute("pLesChevaux", lesChevaux);
            this.getServletContext().getRequestDispatcher("/WEB-INF/views/cheval/list.jsp").forward(request, response);
        }
        if ("/show".equals(path)) {
    try {
        int idCheval = Integer.parseInt(request.getParameter("idCheval"));
        Cheval leCheval = DaoCheval.getLeCheval(cnx, idCheval);

        if (leCheval != null) {
            // 🔽 Récupération des participations du cheval
            ArrayList<Participer> pLesParticipants = DaoCheval.getLesParticipants(cnx, idCheval);
            request.setAttribute("pLesParticipants", pLesParticipants);

            request.setAttribute("pLeCheval", leCheval);
            this.getServletContext().getRequestDispatcher("/WEB-INF/views/cheval/show.jsp").forward(request, response);
        } else {
            response.sendRedirect(request.getContextPath() + "/cheval-servlet/lister");
        }
    } catch (NumberFormatException e) {
        System.out.println("Erreur : l'id du cheval n'est pas un nombre valide");
        response.sendRedirect(request.getContextPath() + "/cheval-servlet/lister");
    }
}


        if ("/add".equals(path)) {
            ArrayList<Race> lesRaces = DaoRace.getLesRaces(cnx);
            request.setAttribute("pLesRaces", lesRaces);
            this.getServletContext().getRequestDispatcher("/WEB-INF/views/cheval/add.jsp").forward(request, response);
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getPathInfo();

        if ("/add".equals(path)) {
            try {
                // Récupération des données du formulaire
                String nom = request.getParameter("nom");
                String dateNaissanceStr = request.getParameter("dateNaissance");
                int raceId = Integer.parseInt(request.getParameter("race"));

                // Création d'un nouveau cheval
                Cheval nouveauCheval = new Cheval();
                nouveauCheval.setNom(nom);

                // Gestion de la date de naissance
                if (dateNaissanceStr != null && !dateNaissanceStr.isEmpty()) {
                    LocalDate dateNaissance = LocalDate.parse(dateNaissanceStr);
                    nouveauCheval.setDateNaissance(dateNaissance);
                }

                // Récupération et attribution de la race
                Race race = DaoRace.getRaceById(cnx, raceId);
                if (race != null) {
                    nouveauCheval.setRace(race);
                } else {
                    throw new Exception("La race sélectionnée n'existe pas");
                }

                // Tentative d'ajout en base de données
                if (DaoCheval.ajouterCheval(cnx, nouveauCheval)) {
                    // Redirection vers la page de consultation du cheval nouvellement créé
                    response.sendRedirect(request.getContextPath() + "/cheval-servlet/show?idCheval=" + nouveauCheval.getId());
                } else {
                    throw new Exception("Erreur lors de l'enregistrement du cheval");
                }

            } catch (NumberFormatException e) {
                request.setAttribute("message", "Erreur : la race sélectionnée n'est pas valide");
                request.setAttribute("pLesRaces", DaoRace.getLesRaces(cnx));
                this.getServletContext().getRequestDispatcher("/WEB-INF/views/cheval/add.jsp").forward(request, response);
            } catch (Exception e) {
                request.setAttribute("message", "Erreur : " + e.getMessage());
                request.setAttribute("pLesRaces", DaoRace.getLesRaces(cnx));
                this.getServletContext().getRequestDispatcher("/WEB-INF/views/cheval/add.jsp").forward(request, response);
            }
        }
    }

    public void destroy() {
    }
}