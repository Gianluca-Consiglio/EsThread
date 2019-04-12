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
public class ContaINani extends Thread{

    public ContaINani(String nome) {
        super();
        setName(nome);
    }
    
    public void run(){
        for(int i = 0; i < 7; i++)
            System.out.println(1+i+ " " + getName());
        System.out.println(getName() + " è terminato");
    }
    
}
