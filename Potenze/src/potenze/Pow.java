/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potenze;

import java.util.ArrayList;

/**
 * thread che dato il vettore dinamico {@link GestoreDati#basi} presente in un oggetto di tipo {@link GestoreDati}
 * calcola le potenze dei singoli interi con esponente {@link Pow#esponente} e li salva nell'array {@link GestoreDati#risultati}.
 * @author Gainluca Consiglio
 */
public class Pow extends Thread{
    
    /**
     * oggetto di tipo {@link GestoreDati} utilizzato per gestire le basi da elevare i il salvataggio dei risultati di tale operazione.
     */
    private GestoreDati gestore;
    
    /**
     * Esponente con il quale verranno elevati gli interi presenti in {@link GestoreDati#basi} mediante la funzione {@link Math#pow(double, double)}.
     */
    private double esponente;

    /**
     * Costruttore.
     * @param gestore Oggetto con all'inerno il vettore da elevare.
     * @param esponente Intero con il quale verrà elevato il vettore.
     */
    public Pow(GestoreDati gestore, int esponente) {
        this.gestore = gestore;
        this.esponente = esponente;
    }
    
    /**
     * Metodo che calcola la potenza di ogni singolo inetro presente in {@link GestoreDati#basi} e la salva vettore {@link GestoreDati#risultati}
     */
    @Override
    public void run(){
        for(int i = 0; i < gestore.getBasi().size(); i++)
            gestore.getRisultati().add(Integer.valueOf((int)Math.pow((double)(gestore.getBasi().get(i)), esponente)));
    }
}
