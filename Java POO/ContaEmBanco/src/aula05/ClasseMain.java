/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author Victor
 */
public class ClasseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ContaBanco c1 = new ContaBanco();
        ContaBanco c2 = new ContaBanco();
        
        c1.setNumConta(1);
        c2.setNumConta(2);
        
        c1.abrirConta("João Victor", "CC");
        c2.abrirConta("Mariane Mendes", "CP");
        
        c1.estadoAtual();
        c2.estadoAtual();
        
        c1.depositar(100);
        c2.depositar(500);
        
        c1.estadoAtual();
        c2.estadoAtual();
        
        c2.sacar(100);
        c1.sacar(1000);
        
        c1.estadoAtual();
        c2.estadoAtual();
        
        
        
        
        
        
        
    }
    
}
