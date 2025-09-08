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
public class CategVente {
    
    private int code ; 
    private String libelle; 
    private ArrayList<Vente> lesVentes ; 

    public CategVente() {
    }

    public int getCode() {
        return code;
    }

    public String getLibelle() {
        return libelle;
    }

    public ArrayList getLesVentes() {
        return lesVentes;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setLesVentes(ArrayList lesVentes) {
        this.lesVentes = lesVentes;
    }
    public void addVente(Vente uneVente){
        if (lesVentes == null){
            lesVentes = new ArrayList<Vente>();
            
        }
        lesVentes.add(uneVente);
    }
    
    
    
}
