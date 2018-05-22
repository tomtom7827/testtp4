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
public class Fonds implements Comparable {
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

    @Override
    public int compareTo(Object t) {
        Fonds f = (Fonds) t;
        if(this.amount < f.getAmount()){
            return -1; }
        else if(this.amount > f.getAmount()){
            return 1;
            }
        else {
            return 0;
        }
    }
    
    @Override
    public boolean equals(Object t) {
       Fonds f = (Fonds) t;
       if(this.amount == f.getAmount()) {
           return true;
       }
       else {
           return false;
       }
    }
}
