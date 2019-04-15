/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paridispari;

/**
 *
 * @author Gianluca Consiglio
 */
public class PariDispari {
    
    /**
     * Main del programma.
     * Cerca di convertire il primo elemento della variabile args in un intero;
     * se l'operazione va a buon fine inizializzerà due thread di tipo {@link PariDispariThread} inizializzando in entrambi
     * la variabile {@link PariDispariThread#massimo} al valore ricavato da args più uno e settando la variabile {@link PariDispariThread#pari}
     * in un caso true e nell'altro false.
     * I due thread vengono poi avviati e viene aspettata la loro terminazione tramite il comando {@link Thread#join()}.
     * @param args Stringa contenete il numero sino al quale si desidera generare la sequenza.
     */
    public static void main(String[] args) {
        
        if (args.length != 1) {
            System.out.println("Dovresti passare il numero intero");
            return;
        }
        int n = Integer.parseInt(args[0]);
        Thread TP = new PariDispariThread(n + 1, true);
        Thread TD = new PariDispariThread(n + 1, false);
        System.out.println("->Contate fino a " + n);
        TP.start();
        TD.start();
        try {
            TP.join();
            TD.join();
        } catch (Exception e) {
        }
        System.out.println("<-Fine conteggio!");
    }
}
