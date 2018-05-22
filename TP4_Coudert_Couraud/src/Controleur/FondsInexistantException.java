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
public class FondsInexistantException extends Exception{
    
    public FondsInexistantException(String msg) {
    super(msg);
}
    public FondsInexistantException() {
        System.out.println("Fonds inexistants !");
    }
    
    
}
