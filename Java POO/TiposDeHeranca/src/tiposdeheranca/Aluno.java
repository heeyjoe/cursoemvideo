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
public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    
    //GETTERS E SETTERS
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    //MÉTODOS ESPECIAIS
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno " + this.getNome() );
    }
    
}
