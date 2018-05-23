/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import Controleur.FondsExistantException;
import Controleur.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Aurélien
 */
public class PorteFeuille {
    public HashMap<String, Fonds> fonds;
    public HashMap<String, Instrument> instrument;
    
    public PorteFeuille() {
        fonds = new HashMap<String, Fonds>();
        instrument = new HashMap<String, Instrument>();
    }
    
    public PorteFeuille(HashMap<String, Fonds> hmap1, HashMap<String, Instrument> hmap2) {
        fonds = hmap1;
        instrument = hmap2;
    }
    
    public double rechercheFonds(String key) throws FondsInexistantException {
        if(fonds.containsKey(key)){
           return fonds.get(key).getAmount(); 
        }
        else {
            throw new FondsInexistantException();
        }
    }
    
    public ArrayList<Fonds> rechercheInstrument(String key) throws InstrumentInexistantException {
        if(instrument.containsKey(key)){
           return instrument.get(key).getFonds(); 
        }
        else {
            throw new InstrumentInexistantException();
        }
        
        
    }
    
    public void ajouterFonds(String key, Fonds newFonds) throws FondsExistantException {
        if(fonds.containsKey(key)) {
            throw new FondsExistantException();
        }
        else {
        fonds.put(key, newFonds);
        System.out.println("Le fond a été ajouté correctement au porte feuille");
        }
    }
    
    public void ajouterInstrument(String key, Instrument newInstru) throws InstrumentExistantException {
        if(instrument.containsKey(key)) {
            throw new InstrumentExistantException();
        }
        else {
        instrument.put(key, newInstru);
        System.out.println("L'instrument a été ajouté correctement au porte feuille");
        }
    }
        public void supprimerFonds(String key) throws FondsInexistantException {
        if(fonds.containsKey(key)){
           fonds.remove(key);
        }
        else {
            throw new FondsInexistantException("Object Innexistant");
        }
    }
    
    public void supprimerInstrument(String key) throws InstrumentInexistantException {
        if(instrument.containsKey(key)){
           instrument.remove(key); 
        }
        else {
            throw new InstrumentInexistantException("Object Innexistant");
        }  
    }
    
    
}
