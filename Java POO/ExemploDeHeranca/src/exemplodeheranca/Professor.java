/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplodeheranca;

/**
 *
 * @author Victor
 */
public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    
    //GETTERS E SETTERS
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    //MÉTODOS ESPECIAIS
    public void receberAum(float aumento){
        this.setSalario(this.getSalario() + aumento);        
    }
}
