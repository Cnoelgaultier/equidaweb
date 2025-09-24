/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author sio2
 */
public class Lieu {
    private int id;
    private String ville; 
    private int nbBoxes; 
    private String Commentaire;
    
    
    private ArrayList<Vente> lesVentes ; 

    public Lieu() {
    }

    public int getId() {
        return id;
    }

    public String getVille() {
        return ville;
    }

    public int getNbBoxes() {
        return nbBoxes;
    }

    public String getCommentaire() {
        return Commentaire;
    }

    public ArrayList<Vente> getLesVentes() {
        return lesVentes;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setNbBoxes(int nbBoxes) {
        this.nbBoxes = nbBoxes;
    }

    public void setCommentaire(String Commentaire) {
        this.Commentaire = Commentaire;
    }

    public void setLesVentes(ArrayList<Vente> lesVentes) {
        this.lesVentes = lesVentes;
    }
    
    public void addVente(Vente uneVente){
        if (lesVentes == null){
            lesVentes = new ArrayList<Vente>();
            
        }
        lesVentes.add(uneVente);
    }
    
    
}
