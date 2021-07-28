/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplodepolimorfismo;

import exemplodepolimorfismo.raiz.maes.Mamifero;
import exemplodepolimorfismo.raiz.maes.Ave;
import exemplodepolimorfismo.raiz.maes.Reptil;
import exemplodepolimorfismo.raiz.maes.Peixe;
import exemplodepolimorfismo.raiz.maes.filhos.Cachorro;
import exemplodepolimorfismo.raiz.maes.filhos.Canguru;

/**
 *
 * @author Victor
 */
public class ExemploDePolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Animal n = new Animal(); - NÃO É POSSÍVEL INSTANCIAR
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        m.setPeso(85.3f);
        m.setIdade(2);
        m.setMembros(2);
        m.locomover();
        m.alimentar();
        m.emitirSom();
        
        p.setPeso(0.35f);
        p.setIdade(1);
        p.setMembros(0);
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();
        
        a.setPeso(0.89f);
        a.setIdade(1);
        a.setMembros(2);
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();
        
        System.out.println("\n\n");
        //Mamifero m = new Mamifero();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        
        m.setPeso(5.70f);
        m.setIdade(8);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();
        
        c.setPeso(55.30f);
        c.setIdade(3);
        c.setMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();
        
        k.setPeso(55.30f);
        k.setIdade(3);
        k.setMembros(4);
        k.locomover();
        k.alimentar();
        k.emitirSom();
    }
    
}
