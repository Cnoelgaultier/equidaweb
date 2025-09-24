/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import model.Olympiade;

/**
 *
 * @author sio2
 */
public class Sport {
    private int id; 
    private String nom; 
    private ArrayList<Olympiade> lesOlympiades;
    private Olympiade olympiade ;

    public Sport() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Olympiade> getLesOlympiades() {
        return lesOlympiades;
    }

    public void setLesOlympiades(ArrayList<Olympiade> lesOlympiades) {
        this.lesOlympiades = lesOlympiades;
    }
    
    public void addOlympiade(Olympiade uneOlympiade){
        if (lesOlympiades == null){
            lesOlympiades = new ArrayList<Olympiade>();
           
        }
        lesOlympiades.add(uneOlympiade);
        
        
    }

    public Olympiade getOlympiade() {
        return olympiade;
    }

    public void setOlympiade(Olympiade olympiade) {
        this.olympiade = olympiade;
    }
    
    
    
    
    
}
