/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7nani;

/**
 *
 * @author gian
 */
public class ProvaNani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Thread thr1 = new ContaINani("thr1");
        Thread thr2 = new ContaINani("thr2");
        thr1.start();
        Thread.sleep(1000);
        thr2.start();
        Thread.sleep(1000);
        System.out.println("fine main-thread");
    }
    
}
