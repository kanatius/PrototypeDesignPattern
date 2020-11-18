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
public class ChaveTetra extends Chave{

    public ChaveTetra() {
        super.tipo = "Chave Tetra";
    }
    
    //construtor para clonagem
    private ChaveTetra(ChaveTetra ch){
        super.tipo = ch.getTipo();
    }
    
    @Override
    public Chave clone(){
        return new ChaveTetra(this);
    }
    
    @Override
    public void updateChave(){
        super.tipo = "Chave Tetra v2";
    }
}
