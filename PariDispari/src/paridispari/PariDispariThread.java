/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paridispari;

/**
 * Thread che produce una sequenza di numeri pari o dispari, a seconda del tipo di thread,
 * da 0 a uno specifico numero.
 * @author Gianluca Consiglio
 */
public class PariDispariThread extends Thread {
    
    /**
     * Numero fino al quale la classe produrrà la sequenza.
     */
    private int massimo;
    
    /**
     * Flag che indica il tipo di thread;
     * se impostato a true indicherà un thread pari, senno uno dispari.
     */
    private boolean pari;
    
    /**
     * tempo di sleep tra la produzione di un numero e quello successivo.
     */
    private int ritardo = 500;

    /**
     * Costruttore di classe.
     * @param finale ultimo numero della sequenza da generare
     * @param pari tipologia del thread
     */
    public PariDispariThread(int finale, boolean pari) {
        massimo = finale;
        this.pari = pari;
    }
    
    /**
     * Conta da 0 al numero massimo, stampando solo i numeri pari se la variabile {@link PariDispariThread#pari pari} 
     * è settata a true, dispari altrimenti.
     * Ogni numero stampato sarà preceduto dal nome del thread e seguito dal suo tipo(pari o dispari).
     */
    public void run() {
        String chisono;
        chisono = Thread.currentThread().getName();
        for (int i = 0; i < massimo; i++) {
            if (pari) {
                if (i % 2 == 0)
                {
                    System.out.println(chisono + "-pari " + i);
                }
            } else
            if (i % 2 != 0) 
            {
                System.out.println(chisono + "-dispari " + i);
            }
            try {
                Thread.sleep(ritardo);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
