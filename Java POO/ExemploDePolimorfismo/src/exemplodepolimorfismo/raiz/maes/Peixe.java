/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplodepolimorfismo.raiz.maes;

import exemplodepolimorfismo.raiz.Animal;

/**
 *
 * @author Victor
 */
public class Peixe extends Animal{
    private String corEscama;
    
    //GETTERS E SETTERS
    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    //MÉTODOS ESPECIAIS
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
    
    public void soltarBolha(){
        System.out.println("Soutou uma bolha");
    }
    
    
    
}
