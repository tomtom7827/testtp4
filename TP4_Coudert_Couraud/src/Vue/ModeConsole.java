/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Modele.Instrument;
import Modele.PorteFeuille;
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
           System.out.println("Clé : " + myhash.getKey() + " , Valeur : " + myhash.getValue());
       }
    } 
}
