/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import Modele.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *Class Main pour le lancement initiale du programme
 * @author Aurélien
 */
public class Main {

   //Reprise de l'exo au 1.6
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FondsInexistantException, FondsExistantException {
        // Init
        Scanner sc = new Scanner(System.in);
        int quit =0;
        int choix;
        Main main = new Main();
        
        while(quit == 0 ) {
            System.out.println("1 : Ajouter un fond");
            System.out.println("2 : Rechercher un fond");
            System.out.println("3 : Ajouter un instrument");
            System.out.println("4 : Rechercher un instrument");
            System.out.println("5 : Quittez");
            System.out.println("Que voulez vous faire ? ");
            choix = sc.nextInt();
            if(choix == 5) {
                quit =1;
            }
            main.menu(choix);
            
        }
         
        
    }
    
    public void menu(int choix) throws FondsExistantException {
        Scanner sc = new Scanner(System.in);
        Fonds f = new Fonds();
        ArrayList<Fonds> a = new ArrayList<Fonds>();
        HashMap<String, Fonds> hmap = new HashMap<String, Fonds>();
        HashMap<String, Instrument> hmap2 = new HashMap<String, Instrument>();
        PorteFeuille p = new PorteFeuille(hmap, hmap2);
        String newKey = new String();
        switch(choix) {
            case 1:
                System.out.println("Ajouter un fond ? Entrez le nom, puis le montant");
                newKey = sc.next();
                f.setAmount(sc.nextDouble());
                 p.ajouterFonds(newKey, f);
                 break;
            case 2:
               try {
               System.out.println("Rechercher un fond ? Entrez la clé :");
               newKey = sc.next();
               p.rechercheFonds(newKey);
               } catch (FondsInexistantException e){
                   System.out.println("Fonds Inexistant, création en cours...");
                   System.out.println("Entrez le montant de la nouvelle clé :");
                   f.setAmount(sc.nextDouble());
                   p.ajouterFonds(newKey, f);
                }
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
                 
                
        }
    }
    
}
