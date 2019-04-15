/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potenze;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gianluca
 */
public class Potenze {

    /**
     * Main del programma che crea un oggetto della classe{@link GestoreDati} con al suo inerno il vettore
     * {@link GestoreDati#basi} contenente i numeri da 1 a 10; verrà poi inizializzato un thread di tipo {@link Pow}
     * che una volta avviato eleverà l'array presente in {@link GestoreDati}.
     * Una volta finita l'attesa della terminazione del thread usando il metodo {@link Thread#join()} viene stampato il risultato
     * dell'operazione presente in {@link GestoreDati#risultati}
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> basi = new ArrayList<>();
        for(int i = 1; i < 11; i++)
            basi.add(i);
        GestoreDati gestore = new GestoreDati(basi);
        Thread p = new Pow(gestore,2);
        p.run();
        try {
            p.join();
        } catch (InterruptedException ex) {
            return;
        }
        System.out.println(gestore.getRisultati());
    }
    
}
