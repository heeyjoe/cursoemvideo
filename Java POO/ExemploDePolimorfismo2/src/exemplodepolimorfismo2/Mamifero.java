/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplodepolimorfismo2;

/**
 *
 * @author Victor
 */
public class Mamifero extends Animal{
    protected String corPelo;
    
    //GETTERS E SETTERS
    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    //MÉTODOS ESPECIAIS
    @Override
    public void emitirSom(){
        System.out.println("Som de mamífero");
    }
    
}
