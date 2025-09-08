/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.time.LocalDate;
import model.Vente;
import model.CategVente;
import model.Lieu ;
import java.util.ArrayList;
        
public class TestVente {
    public static void main (String args[]){
        
        Vente v = new Vente() ; 
        v.setId(1);
        v.setNom("hiver 2025");
        v.setDateDebutVente(LocalDate.of(2025, 1, 25));
        
        
        CategVente c = new CategVente();
        c.setCode(1); 
        c.setLibelle("Pouliniere "); 
        
        Lieu l = new Lieu(); 
        l.setId(1); 
        l.setVille("Deauville");
        l.setNbBoxes(4);
        l.setCommentaire("Grand lieu avec buvette ainsi que traducteur.");
        
        
        v.setCategVente(c);
        v.setLieu(l);
        
        
        System.out.println("Vente : " + v.getId() + " " + v.getNom() + " " + v.getDateDebutVente()
    + " | Categorie : " + v.getCategVente().getCode() + " " + v.getCategVente().getLibelle()
    + " | Lieu : " + v.getLieu().getId() + " " + v.getLieu().getVille() + " " + v.getLieu().getNbBoxes()
    + " " + v.getLieu().getCommentaire());

        
        
        
        
        
                
        
    }
}
