/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Modele.Fonds;
import Modele.Instrument;
import Modele.PorteFeuille;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author Aurélien
 */
public class ModeConsole {
    
    public ModeConsole() {
        
    }
    
    public void afficherInstrument(PorteFeuille p) {
        
       System.out.println("Affichage des instruments du portefeuille");
       for(Map.Entry myhash : p.instrument.entrySet()) {
           double cpt =0;
           Instrument instru = (Instrument) myhash.getValue();
           ArrayList<Fonds> al = instru.getFonds();
           for (int i = 0; i<instru.getFonds().size(); i++) {
               cpt += al.get(i).getAmount();
           }
           System.out.println("Clé : " + myhash.getKey() + " , Taille :" + instru.getFonds().size() + " , Somme :" + cpt);
       }
    } 
    
        public void afficherFonds(PorteFeuille p) {
        
       System.out.println("Affichage des fonds du portefeuille");
       for(Map.Entry myhash : p.fonds.entrySet()) {
           double cpt =0;
           Instrument instru = (Instrument) myhash.getValue();
           ArrayList<Fonds> al = instru.getFonds();
           for (int i = 0; i<instru.getFonds().size(); i++) {
               cpt += al.get(i).getAmount();
           }
           System.out.println("Clé : " + myhash.getKey() + " , Taille :" + instru.getFonds().size() + " , Somme :" + cpt);
       }
    }
}
