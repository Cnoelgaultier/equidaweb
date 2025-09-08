/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sio2
 */
public class Enchere {
    
    private int numero; 
    private int Montant; 
    
    private Lot lot; 
    

    public Enchere() {
    }

    public int getNumero() {
        return numero;
    }

    public int getMontant() {
        return Montant;
    }

    public Lot getLot() {
        return lot;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setMontant(int Montant) {
        this.Montant = Montant;
    }

    public void setLot(Lot lot) {
        this.lot = lot;
    }
    
    
    
    
    
}
