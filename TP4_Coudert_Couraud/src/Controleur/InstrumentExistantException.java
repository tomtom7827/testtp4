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
public class InstrumentExistantException extends Exception{
    
    public InstrumentExistantException() {
        System.out.println("L'instrument existe deja !");
    }
}
