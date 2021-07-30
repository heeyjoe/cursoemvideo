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
public class ExemploDePolimorfismo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Animal a = new Animal();
        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();
        
        m.emitirSom();
        l.emitirSom();
        c.emitirSom();
        
        System.out.println("\n\n");
        
        c.reagir("Olá");
        c.reagir("Vai apanhar");
        
        c.reagir(11,45);
        c.reagir(21,00);
        
        c.reagir(true);
        c.reagir(false);
        
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
    }
    
}
