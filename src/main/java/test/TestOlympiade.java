/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import java.time.LocalDate;
import java.util.ArrayList;
import model.Sport;
import model.Olympiade;




/**
 *
 * @author sio2
 */
public class TestOlympiade {
    
    public static void main(String[] args) {
    
        
         Olympiade o = new Olympiade();
         o.setId(1);
         o.setAnnee(LocalDate.of(2025, 6, 25));
         
         
         Sport s1 = new Sport();
         s1.setId(1);
         s1.setNom("Football");
         
         Sport s2 = new Sport();
         
         s2.setId(2);
         s2.setNom("Basketball");
         
         
         ArrayList<Sport> sports = new ArrayList<Sport>();
         sports.add(s1);
         sports.add(s2);
         o.setLesSports(sports);
         
         System.out.println("L' Olympiade numero " + o.getId() + " se deroulera a la date : " + o.getAnnee()); 
         System.out.println("Liste des sports ");
         
         for (Sport s : o.getLesSports()){
             System.out.println("Sport numéro : " + s.getId() + " qui est " + s.getNom() + " se derouleront a la date : " + s.getLesOlympiades());
         }
         
    
    
    
    
    
    
    }
    
    
    
}
