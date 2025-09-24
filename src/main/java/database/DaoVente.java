/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import model.Vente;
import model.Lieu;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Cheval;
/**
 *
 * @author sio2
 */
public class DaoVente {
    
    Connection cnx;
    static PreparedStatement requeteSql = null;
    static ResultSet resultatRequete = null;
    
    
    public static ArrayList<Vente> getLesVentes(Connection cnx){
        ArrayList<Vente> lesVentes = new ArrayList<Vente>();
        try{
            requeteSql = cnx.prepareStatement("Select v.id as v_id, v.nom as v_nom, v.dateDebutVente as v_dateDebutVente, v.corpsMessage as v_corpsMessage,\n" +
"                    v.idLieu as v_idLieu, l.id AS l_id, l.libelle AS l_libelle\n" +
"                   From Vente v\n" +
"                     Inner Join lieu_ l on v.idLieu = l.id");
            
            resultatRequete = requeteSql.executeQuery();
            while (resultatRequete.next()){
                Vente v = new Vente(); 
                v.setId(resultatRequete.getInt("v_id"));
                v.setNom(resultatRequete.getString("v_nom"));
                v.setDateDebutVente(resultatRequete.getDate("v_dateDebutVente").toLocalDate());
                v.setCorpsMessage(resultatRequete.getString("v_corpsMessage"));
                Lieu l = new Lieu();
                l.setId(resultatRequete.getInt("l_id"));
                l.setVille(resultatRequete.getString("l_libelle"));
                v.setLieu(l);
                lesVentes.add(v);                 
            }           
        }catch (SQLException e) {
            e.printStackTrace();
            System.out.println("La requête de getLesVentes a généré une exception SQL");
        }
        return lesVentes;
    }
    
    public static Vente getLaVente(Connection cnx, int idVente) {
    Vente vente = null;
    PreparedStatement requeteSql = null;
    ResultSet resultatRequete = null;

    try {
        String sql = "SELECT v.id as v_id, v.nom as v_nom, v.dateDebutVente as v_dateDebutVente, " +
                     "v.corpsMessage as v_corpsMessage, v.idLieu as v_idLieu, " +
                     "l.id AS l_id, l.libelle AS l_libelle " +
                     "FROM Vente v " +
                     "INNER JOIN lieu_ l ON v.idLieu = l.id " +
                     "WHERE v.id = ?";

        requeteSql = cnx.prepareStatement(sql);
        requeteSql.setInt(1, idVente);
        resultatRequete = requeteSql.executeQuery();  // ✅ exécution de la requête

        if (resultatRequete.next()) {
            vente = new Vente();
            vente.setId(resultatRequete.getInt("v_id"));
            vente.setNom(resultatRequete.getString("v_nom"));
            vente.setDateDebutVente(resultatRequete.getDate("v_dateDebutVente").toLocalDate());
            vente.setCorpsMessage(resultatRequete.getString("v_corpsMessage"));

            Lieu lieu = new Lieu();
            lieu.setId(resultatRequete.getInt("l_id"));
            lieu.setVille(resultatRequete.getString("l_libelle"));
            vente.setLieu(lieu);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("La requête de getLaVente a généré une exception SQL");
    } finally {
        try { if (resultatRequete != null) resultatRequete.close(); } catch (SQLException ignored) {}
        try { if (requeteSql != null) requeteSql.close(); } catch (SQLException ignored) {}
    }

    return vente;
}
/*public static boolean ajouterVente(Connection cnx, Vente vente) {
    try {
    requeteSql = cnx.prepareStatement(
        "INSERT INTO Vente " +
        "(id, nom, idCategVente, idLieu, dateDebutVente, dateFinVente, dateDebutInscription,"
                + " dateEnvoiMessage, objetMessage, corpsMessage) " +
        "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
        PreparedStatement.RETURN_GENERATED_KEYS
    );
    requeteSql.setInt(1, vente.getId());  // id fourni par l'objet Vente
        requeteSql.setString(2, vente.getNom());
        requeteSql.setInt(3, vente.g;
        requeteSql.setInt(4, vente.getIdLieu());

        // Dates
        if (vente.getDateDebutVente() != null) {
            requeteSql.setDate(5, java.sql.Date.valueOf(vente.getDateDebutVente()));
        } else {
            requeteSql.setNull(5, java.sql.Types.DATE);
        }

        if (vente.getDateFinVente() != null) {
            requeteSql.setDate(6, java.sql.Date.valueOf(vente.getDateFinVente()));
        } else {
            requeteSql.setNull(6, java.sql.Types.DATE);
        }

        if (vente.getDateDebutInscription() != null) {
            requeteSql.setDate(7, java.sql.Date.valueOf(vente.getDateDebutInscription()));
        } else {
            requeteSql.setNull(7, java.sql.Types.DATE);
        }

        if (vente.getDateEnvoiMessage() != null) {
            requeteSql.setDate(8, java.sql.Date.valueOf(vente.getDateEnvoiMessage()));
        } else {
            requeteSql.setNull(8, java.sql.Types.DATE);
        }

        // Objet et corps du message
        requeteSql.setString(9, vente.getObjetMessage());
        requeteSql.setString(10, vente.getCorpsMessage());
    
    
    
    


    
}
}*/
    
}