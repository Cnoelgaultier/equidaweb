package test;

import java.time.LocalDate;
import java.util.ArrayList;
import model.Lieu;
import model.Vente;

public class TestLieu {

    public static void main(String[] args) {

       
        Lieu l = new Lieu();
        l.setId(1);
        l.setVille("Vincennes");
        l.setNbBoxes(18);
        l.setCommentaire("Aux abords de Paris");

        
        Vente v1 = new Vente();
        v1.setId(1);
        v1.setNom("Vente été");
        v1.setDateDebutVente(LocalDate.of(2025, 6, 25));

        Vente v2 = new Vente();
        v2.setId(2); 
        v2.setNom("Vente automne");
        v2.setDateDebutVente(LocalDate.of(2025, 9, 25));

      
        ArrayList<Vente> ventes = new ArrayList<Vente>();
        ventes.add(v1);
        ventes.add(v2);
        l.setLesVentes(ventes); 

        
        System.out.println("Le lieu est " + l.getId() + " " + l.getVille() + " et contient " + l.getLesVentes().size() + " ventes.");
        System.out.println("Liste des ventes du lieu :");

       for (Vente v : l.getLesVentes()) {
            System.out.println("Vente numéro : " + v.getId() 
                    + " " + v.getNom() + " le " + v.getDateDebutVente());
            
       
       
       }
        
        }
    }

