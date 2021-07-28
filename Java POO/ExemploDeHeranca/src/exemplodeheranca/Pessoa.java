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
public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    //MÉTODOS ESPECIAIS
    public void fazerAniv(){
        System.out.println("PARABÉNS PRA VOCÊ \\õ/");
        this.setIdade(this.getIdade() + 1);
    }

    @Override
    public String toString() {
        return "Pessoa{\n" 
                + "nome = " + nome + ",\n "
                + "idade = " + idade + ", \n"
                + "sexo = " + sexo + "\n}\n";
    }
    
    
}
