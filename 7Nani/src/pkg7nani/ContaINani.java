/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7nani;

/**
 * Classe ereditata dalla superclasse {@link Thread} che stampa
 * in sequenza il nome di tutti e sette i nani.
 * @author Gianluca Consiglio
 */
public class ContaINani extends Thread{
    private String[] nomi = {"Mammolo","Eolo","Dotto","Brontolo","Pisolo","Gongolo","Cucciolo"};
    
    /**
     * Construttore che setta il nome del thread
     * @param nome nome del thread
     */
    public ContaINani(String nome) {
        super();
        setName(nome);
    }
    /**
     * Stampa a video i nomi dei sette nani e il nome del thread.
     */
    public void run(){
        for(int i = 0; i < nomi.length; i++)
            System.out.println(nomi[i] + " " + getName());
        System.out.println(getName() + " è terminato");
    }
    
}
