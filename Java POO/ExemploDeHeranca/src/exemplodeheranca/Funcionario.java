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
public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;
    
    //GETTERS E SETTERS
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public boolean getTrabalhando() {
        return trabalhando;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    //MÉTODOS ESPECIAIS
    public void mudarTrabalho(){
        this.setTrabalhando(!this.getTrabalhando());   
    }    
}
