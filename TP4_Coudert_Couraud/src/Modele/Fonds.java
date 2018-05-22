/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author Aurélien
 */
public class Fonds {
    private double amount;
    
    public Fonds() {
        amount = 0;
    }
    
    public Fonds(double montant) {
        amount = montant;
    }

    public double getAmount() {
        return amount;
    }
    
    public void setAmount(double newAmount) {
        amount = newAmount;
    }
}
