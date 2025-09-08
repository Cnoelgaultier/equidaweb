/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.time.LocalDate;

/**
 *
 * @author sio2
 */
public class Courriel {
    
    private int id; 
    private LocalDate date; 
    private String objet ; 
    private String Corps; 
    
    private Vente vente; 

    public Courriel() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public void setCorps(String Corps) {
        this.Corps = Corps;
    }

    public void setVente(Vente vente) {
        this.vente = vente;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getObjet() {
        return objet;
    }

    public String getCorps() {
        return Corps;
    }

    public Vente getVente() {
        return vente;
    }
    
    
    
}
