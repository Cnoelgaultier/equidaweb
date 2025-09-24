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
public class Olympiade {
    private int id;
    private LocalDate annee;
    private ArrayList<Sport> lesSports;

    public Olympiade() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getAnnee() {
        return annee;
    }

    public void setAnnee(LocalDate annee) {
        this.annee = annee;
    }

    public ArrayList<Sport> getLesSports() {
        return lesSports;
    }

    public void setLesSports(ArrayList<Sport> lesSports) {
        this.lesSports = lesSports;
    }
    
    
    
    public void addSport(Sport unSport){
        if (lesSports ==null){
            lesSports = new ArrayList<Sport>();
            
        }
        lesSports.add(unSport);
    }
    
    
    
}
