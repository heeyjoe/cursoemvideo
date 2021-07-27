/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojicombate;
import java.util.Random;

/**
 *
 * @author Victor
 */
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //GETTERS E SETTERS

    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean getAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    //Regras da luta:
    //1 - Só pode ser marcada entre lutadores da mesma categoria
    //2 - Desafiado e desafiante devem ser lutadores diferentes
    //3 - Só pode acontecer se estiver aprovada
    //4 - Só pode ter como resultado a vitória de um dos lutadores ou empate    
    
    //OUTROS MÉTODOS
    public void marcarLuta(Lutador l1, Lutador l2){
        if((l1.getCategoria() == l2.getCategoria()) && (l1 != l2)){
            this.setAprovada(true); //Luta aprovada
            this.setDesafiante(l1); //Desafiante é o l1
            this.setDesafiado(l2);  //Desafiado é o l2
        }
    }

    public void lutar(Lutador l1, Lutador l2){
        if (this.aprovada){
            l1.apresentar();
            l2.apresentar();
            
            Random random = new Random();
            
            int vencedor = random.nextInt(1);
                  
            
            
        }
        else{
            System.out.println("Luta não pode acontecer");
        }
        
    }    
}
