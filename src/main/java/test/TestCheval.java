package test;

import model.Cheval;
import model.Race;
import model.ChevalCourse;
import model.Course;
import java.util.ArrayList;
import java.time.LocalDate;

public class TestCheval {

    public static void main (String args[]){

        // création d'une instance de cheval nommée c
        Cheval c = new Cheval();
        c.setId(2);
        c.setNom("Houri");
        c.setCodeSire("Sire001");
        c.setTaille(1.8);
        c.setPoids(390.4);
        
        Cheval c15 = new Cheval();
        c15.setId(15);
        c15.setNom("Fleur du désert");
        c.setChevalMere(c15);
        
        Cheval c11 = new Cheval();
        c11.setId(11);
        c11.setNom("Mustang");
        c.setChevalPere(c11);
        

       
        Race r = new Race();
        r.setId(1);
        r.setNom("pur-sang");

        
        c.setRace(r);
        
        
        
        
        
       /* */
       
       Cheval ct = new Cheval();
       ct.setId(2);
       ct.setNom("hermion");
       
       
       Course course1 = new Course();
       course1.setId(1);
       course1.setLieu("Vincennes");
       course1.setNom("Grand Prix Vincennes");
       course1.setDate(LocalDate.MAX);
       
       
        
       
       

        
        System.out.println("Cheval : " + c.getId() + " " + c.getNom() 
                + " à pour identification" + c.getCodeSire() + " son pere est : " + c.getChevalPere().getNom() + " et sa mere est : " + c.getChevalMere().getNom() + " pèse " + c.getPoids() + " et mesure " + c.getTaille()
                + c.getRace().getId() + " " + c.getRace().getNom());
        
    }

    
    
}
