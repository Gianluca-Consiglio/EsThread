/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potenze;

import java.util.ArrayList;

/**
 * La classe serve da contenitore per gli interi utilizzati dai thread di tipo {@link Pow}
 * @author Gianluca Consiglio
 */
public class GestoreDati {
    /**
     * Array dinamico per contenere le basi che poi verranno elevate
     */
    private ArrayList<Integer> basi;
    
    /**
     * Array dinamico dove vengono salvati i risultati dell'operazione di elevamento.
     */
    private ArrayList<Integer> risultati;

    /**
     * Costruttore dove viene assegnato l'array di basi da elevare
     * @param basi interi che saranno elevati.
     */
    public GestoreDati(ArrayList<Integer> basi) {
        this.basi = basi;
        risultati = new ArrayList<>();
    }
    
    /**
     * 
     * @return Array di basi da elevare.
     */
    public ArrayList<Integer> getBasi() {
        return basi;
    }

    /**
     * 
     * @return Array di interi.
     */
    public ArrayList<Integer> getRisultati() {
        return risultati;
    }

    /**
     * 
     * @param risultati Array di interi contenente i risultati dell'elevamento di {@link GestoreDati#basi}.
     */
    public void setRisultati(ArrayList<Integer> risultati) {
        this.risultati = risultati;
    }
       
    
    
    
}
