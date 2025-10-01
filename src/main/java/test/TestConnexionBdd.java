package test;

import java.sql.Connection;
import java.util.ArrayList;

import database.Connexionbdd;
import database.DaoCheval;
import database.DaoVente;

public class TestConnexionBdd {

    public static void main (String args[]) {

        Connection cnx = Connexionbdd.ouvrirConnexion();
        System.out.println ("nombre de chevaux = " + DaoVente.getLesLots(cnx, 1).size());
       System.out.println("Père id: " + DaoCheval.getLeCheval(cnx, 1).getChevalPere() );
       System.out.println("Père id: " + DaoCheval.getLeCheval(cnx, 1).getChevalMere() );


        
        System.out.println ("nombre de Course = " + DaoCheval.getLesParticipants(cnx, 1).size());
        /*
        System.out.println ("nombre de chevaux = " + DaoCheval.getLesChevaux(cnx).size());
        System.out.println ("Voici le cheval n° :  "+ DaoCheval.getLeCheval(cnx, 1).getId()
                + " est "+  DaoCheval.getLeCheval(cnx, 1).getNom()+ " qui est de  la race :   " 
                + DaoCheval.getLeCheval(cnx, 1).getRace().getNom());

        System.out.println("Le nombre de ventes = :  " + DaoVente.getLesVentes(cnx).size());
        System.out.println("La vente n° " + DaoVente.getLaVente(cnx, 1).getId()
        + " se nomme "+ DaoVente.getLaVente(cnx, 1).getNom() + " elle se déroule à "
                + DaoVente.getLaVente(cnx, 1).getLieu().getVille());
            }*/

}
}
