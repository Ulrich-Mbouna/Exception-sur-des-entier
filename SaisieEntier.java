/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saisieentier;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author fany
 */

class SaisieException extends Exception{
    public  SaisieException(String s) {
        super(s);
    }
} 
public class SaisieEntier {
    
    public static void saisieCorrect() throws SaisieException {
        Scanner sc = new Scanner(System.in);
        int valeur = 0;
        System.out.println("Donner un entier : ");
        valeur = sc.nextInt();
        
        if(valeur < 10)
            throw new SaisieException("valeur < 10");
        System.out.println("L'entier saisie est : "+ valeur);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {
          try {
              saisieCorrect();
          }
          catch (SaisieException e) {
              System.out.println(e.getMessage());
          }
          catch (InputMismatchException e) {
              System.out.println("Erreur de saisie!");
          }
        }
    }
    
}
