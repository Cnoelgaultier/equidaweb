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
public class Lot {
    
    private int id; 
    private int prixDepart; 
    
    private ArrayList<Enchere> lesEncheres; 

    public Lot(int id, int prixDepart, ArrayList<Enchere> lesEncheres) {
        this.id = id;
        this.prixDepart = prixDepart;
        this.lesEncheres = lesEncheres;
    }

    public int getId() {
        return id;
    }

    public int getPrixDepart() {
        return prixDepart;
    }

    public ArrayList<Enchere> getLesEncheres() {
        return lesEncheres;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrixDepart(int prixDepart) {
        this.prixDepart = prixDepart;
    }

    public void setLesEncheres(ArrayList<Enchere> lesEncheres) {
        this.lesEncheres = lesEncheres;
    }
    
    
    
}
