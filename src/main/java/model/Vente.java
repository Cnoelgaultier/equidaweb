/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author sio2
 */
public class Vente {
    private int id;
    private String nom;
    private LocalDate dateDebutVente;
    
    private Lieu lieu; 
    
    private CategVente categVente; 
    
    
    private ArrayList<Courriel> lesCourriels ; 
    
    public Vente(){
        
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public LocalDate getDateDebutVente() {
        return dateDebutVente;
    }

    public Lieu getLieu() {
        return lieu;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDateDebutVente(LocalDate dateDebutVente) {
        this.dateDebutVente = dateDebutVente;
    }

    public void setLieu(Lieu lieu) {
        this.lieu = lieu;
    }

    public ArrayList<Courriel> getLesCourriels() {
        return lesCourriels;
    }

    public void setLesCourriels(ArrayList<Courriel> lesCourriels) {
        this.lesCourriels = lesCourriels;
    }

    public CategVente getCategVente() {
        return categVente;
    }

    public void setCategVente(CategVente categVente) {
        this.categVente = categVente;
    }
    
    
    
    }

    
    
    
    
    
        
    
    
   
   

