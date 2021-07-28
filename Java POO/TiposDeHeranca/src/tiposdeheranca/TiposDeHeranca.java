/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdeheranca;

/**
 *
 * @author Victor
 */
public class TiposDeHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Pessoa p1 = new Pessoa(); Não é possível
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        a1.setNome("Cláudio");
        a1.setMatricula(001);
        a1.setCurso("Informática");
        a1.setIdade(22);
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        b1.setMatricula(002);
        b1.setNome("Jubileu");
        b1.setBolsa(12);
        b1.setSexo("M");
        b1.pagarMensalidade();
    }   
}