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
public abstract class Chave implements ICloneable{
    
    protected String tipo;
    
    public String getTipo(){
        return this.tipo;
    }
    
    @Override
    public abstract Chave clone();
    
    public abstract void updateChave();
}
