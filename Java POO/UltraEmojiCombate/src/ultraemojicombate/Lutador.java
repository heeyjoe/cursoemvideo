/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojicombate;

/**
 *
 * @author Victor
 */
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //CONSTRUTOR
    public Lutador(String nome, String nacionalidade, 
            int idade, float altura, float peso, 
            int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
    
   
    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
  
        setCategoria();
    }
    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if(this.getPeso() < 52.2){
            System.out.println("Peso inválido");
        }
        else if (this.getPeso() <= 70.3){
            this.categoria = "Leve";
        }
        else if(this.getPeso() <= 83.9){
            this.categoria = "Médio";
        }
        else if(this.getPeso() <= 120.2){
            this.categoria = "Pesado";
        }
        else{
            System.out.println("Peso inválido");
        }
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
    //OUTROS MÉTODOS
    public void apresentar(){
        System.out.println("--------------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos ele, ");
        System.out.println(this.getNome() + ", ");
        System.out.println("diretamente de " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " snos, ");
        System.out.println(this.getAltura()+ "m de altura e ");
        System.out.println("pesando " + this.getPeso() + " Kg.");
        
        System.out.println("Ele tem ");
        System.out.println(this.getVitorias() + " vitórias, ");
        System.out.println(this.getDerrotas() + " derrotas e ");
        System.out.println(this.getEmpates() + " empates.");
        System.out.println("--------------------------------------------");
    }
    
    public void status(){
        System.out.println(this.getNome());
        System.out.println("É um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");   
    }
  
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+ 1);
    }
    
    
    
    
}
