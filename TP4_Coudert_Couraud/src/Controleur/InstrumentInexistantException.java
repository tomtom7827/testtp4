/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

/**
 *
 * @author Aurélien
 */
public class InstrumentInexistantException extends Exception {
    
    public InstrumentInexistantException() {
        System.out.println("Instrument inexistant !");
    }
        public InstrumentInexistantException(String msg) {
    super(msg);
}
    
}
