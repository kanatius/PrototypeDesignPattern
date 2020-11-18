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
public class ChaveGorge extends Chave{
    public ChaveGorge() {
        super.tipo = "Chave Gorge";
    }
    
    //construtor para clonagem
    private ChaveGorge(ChaveGorge ch) {
        super.tipo = ch.getTipo();
    }
    
    @Override
    public Chave clone() {
        return (Chave) new ChaveGorge(this);
    }

    @Override
    public void updateChave() {
        super.tipo = "Chave Gorge v2";
    }
}
