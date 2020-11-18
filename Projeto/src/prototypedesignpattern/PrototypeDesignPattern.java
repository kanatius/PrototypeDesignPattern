/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypedesignpattern;

import chaves.Chave;
import chaves.ChaveGorge;
import chaves.ChaveTetra;
import chaves.ChaveYale;
import chaves.ICloneable;

/**
 *
 * @author natan
 */
public class PrototypeDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //cria 1 chave de cada tipo
        Chave chaveYale = new ChaveYale();
        Chave chaveGorge = new ChaveGorge();
        Chave chaveTetra = new ChaveTetra();
        
        //clona as chaves
        Chave ch1 = chaveYale.clone();
        Chave ch2 = chaveGorge.clone();
        Chave ch3 = chaveTetra.clone();
        
        //melhora as chaves que foram objeto de clonagem
        chaveYale.updateChave();
        chaveGorge.updateChave();
        chaveTetra.updateChave();  
        
        //imprime os tipos dos clones
        System.out.println(ch1.getTipo());
        System.out.println(ch2.getTipo());
        System.out.println(ch3.getTipo());
        
        //imprime os tipos das chaves objetos de clonagem após a melhoria da chave
        System.out.println(chaveYale.getTipo());
        System.out.println(chaveGorge.getTipo());
        System.out.println(chaveTetra.getTipo());

        //os clone das chaves permaneceram iguais ao estado que foram criadas, 
        //enquanto as chaves que serviram de modelo mudaram de forma independete
        
    }
    
}
