/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadefinalpoo;

/**
 *
 * @author Victor
 */
public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;
    
    //CONSTRUTOR
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.setLogin(login);
        this.setTotAssistido(0);
    }
    
    
    
    
    //GETTERS E SETTERS
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotAssistido() {
        return totAssistido;
    }
    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    //MÉTODOS ESPECIAIS
    public void viuMaisUm(){
        this.setTotAssistido(this.getTotAssistido() + 1);
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + ", login=" + login + ", totAssistido=" + totAssistido + '}';
    }   
    
}
