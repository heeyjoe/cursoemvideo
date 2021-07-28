/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplodepolimorfismo.raiz.maes.filhos;
import exemplodepolimorfismo.raiz.maes.Mamifero;

/**
 *
 * @author Victor
 */
public class Cachorro extends Mamifero{
    public void enterrarOsso(){
        System.out.println("Enterrando ossso");
    }
    
    public void abanarRabo(){
        System.out.println("Abanando o rabo");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("AU AU AU");
    }
}
