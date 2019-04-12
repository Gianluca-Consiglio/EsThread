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
public class DinDonDan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Thread thr0 = new Thread(new Campana("din", 3));
        Thread thr1 = new Thread(new Campana("don", 3));
        Thread thr2 = new Thread(new Campana("dan", 3));
        thr0.start();
        thr0.join();
        thr1.start();
        thr1.join();
        thr2.start();
        
    }
    
}
