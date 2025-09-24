/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.time.LocalDate;

import model.Sport;
import model.Olympiade;

/**
 *
 * @author sio2
 */
public class TestSport {
    
    
    public static void main (String args[]){
        
        Sport s = new Sport();
        s.setId(1);
        s.setNom("Football");
        
        Sport s2 = new Sport();
        s2.setId(2);
        s2.setNom("Basketball");
        
        
        Olympiade o1 = new Olympiade();
        o1.setId(1);
        o1.setAnnee(LocalDate.of(2025, 1, 25));
        
        
        Olympiade o2 = new Olympiade();
        o2.setId(2);
        o2.setAnnee(LocalDate.of(2025, 6, 25));
        
        s.setOlympiade(o1);
        s2.setOlympiade(o2);
        
      
        
        
        System.out.println("le sport numero " + s.getId() + " qui est le " + s.getNom() + " se jouera le " + s.getOlympiade().getAnnee()
                + " et le sport numero " + s2.getId() + " qui est le " + s2.getNom() + " celui ci se jouera le " + s2.getOlympiade().getAnnee()    );
        
        
       
       
        
        
        
                
                
        
        
        
        
        
      
}}
