/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campane;

/**
 * Thread che stampa una stringa per un certo numero di volte
 * @author Gianluca Consiglio
 */
public class Campana implements Runnable{
    String suono;
    int volte;
    /**
     * Costruttore. setta la stringa da stampare e il numero di volte.
     * @param suono stringa da spampare
     * @param volte ripetizioni
     */
    Campana(String suono, int volte){
        this.suono = suono;
        this.volte = volte;
    }
    
    public void run(){
        for(int i = 0; i < volte; i++){
            System.out.println(i + 1 + " " + suono);
            
        }
            
    }
    
}
