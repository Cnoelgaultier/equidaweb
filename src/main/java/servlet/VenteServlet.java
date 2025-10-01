/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;



import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import database.DaoVente;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.Vente;

import model.Lot;
import java.time.LocalDate;
/*
 *
 * @author sio2
 */
@WebServlet(name = "venteServlet", urlPatterns = {"/vente-servlet/*"})
public class VenteServlet extends HttpServlet {

    
    Connection cnx;
    
    @Override
    public void init() {
        ServletContext servletContext = getServletContext();
        cnx = (Connection)servletContext.getAttribute("connection");
        try {
            System.out.println("INIT SERVLET=" + cnx.getSchema());
        } catch (SQLException ex) {
            Logger.getLogger(VenteServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("hjkhkjh");
        
        String path = request.getPathInfo();
        System.out.println("PathInfo: " + path);

        if ("/list".equals(path)) {
            ArrayList<Vente> lesVentes = DaoVente.getLesVentes(cnx);
            request.setAttribute("pLesVentes", lesVentes);
            this.getServletContext().getRequestDispatcher("/WEB-INF/views/vente/list.jsp").forward(request, response);
        }
        if ("/show".equals(path)) {
    try {
        int idVente = Integer.parseInt(request.getParameter("idVente"));
        Vente laVente = DaoVente.getLaVente(cnx, idVente);

        if (laVente != null) {
            
            ArrayList<Lot> lesLots = DaoVente.getLesLots(cnx, idVente);

            System.out.println("Nombre de lots récupérés : " + lesLots.size());

            request.setAttribute("pLaVente", laVente);
            request.setAttribute("pLesLots", lesLots);

            this.getServletContext().getRequestDispatcher("/WEB-INF/views/vente/show.jsp").forward(request, response);
        } else {
            response.sendRedirect(request.getContextPath() + "/vente-servlet/lister");
        }
    } catch (NumberFormatException e) {
        System.out.println("Erreur : l'id de la vente n'est pas un nombre valide");
        response.sendRedirect(request.getContextPath() + "/vente-servlet/lister");
    }
}


     
 

    }}