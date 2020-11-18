/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chaves;
/**
 *
 * @author natan
 */
public class ChaveYale extends Chave{

    public ChaveYale() {
        super.tipo = "Chave Yale";
    }
    
    //construtor para clonagem
    private ChaveYale(ChaveYale ch){
        super.tipo = ch.getTipo();
    }
    
    @Override
    public Chave clone(){
        return (Chave) new ChaveYale(this);
    }
    
    public void updateChave(){
        super.tipo = "Chave Yale v2";
    }
}
