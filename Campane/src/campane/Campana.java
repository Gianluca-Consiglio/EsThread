/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campane;

/**
 *
 * @author gian
 */
public class Campana implements Runnable{
    String suono;
    int volte;
    
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
