/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Aurélien
 */
public class Instrument {
    private ArrayList<Fonds> fonds;
    
    public Instrument() {
        fonds = new ArrayList<Fonds>();
    }
    
    public Instrument(ArrayList<Fonds> array) {
        fonds = array;
    }
    
    public void ajouterFonds(Fonds newFonds) {
        fonds.add(newFonds);
    }
    
    public ArrayList<Fonds> getFonds() {
        return fonds;
    }
    public void TriMontant()
    {
        
        Collections.sort(fonds);
    }
}
