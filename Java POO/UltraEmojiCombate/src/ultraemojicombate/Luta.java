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
    public void marcarLuta(Lutador desafiante, Lutador desafiado){
        if((desafiante.getCategoria().equals(desafiado.getCategoria())) 
                && (desafiante != desafiado)){
            this.setAprovada(true); //Luta aprovada
            this.setDesafiado(desafiado);  //desafiado
            this.setDesafiante(desafiante); //desafiante   
        }
    }

    public void lutar(){
        if (this.getAprovada()){
            System.out.println("Deste lado...");
            desafiado.apresentar();
            System.out.println("E do outro lado...");
            desafiante.apresentar();
            
            //0: empate
            //1: vencedor desafiado; 
            //2: vencedor desafiante;
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); 
            
            System.out.println("### RESULTADO DA LUTA ####");
            switch(vencedor){
                //Empate
                case 0: System.out.println("EMPATE!");
                        desafiado.empatarLuta();        
                        desafiante.empatarLuta();
                        break;
                //Ganhou desafiado
                case 1: System.out.println("LUTADOR VENCEDOR: o desafiado " + desafiado.getNome());
                        desafiado.ganharLuta();        
                        desafiante.perderLuta();
                        break;
                //Ganhou desafiante
                case 2: System.out.println("LUTADOR VENCEDOR: o desafiante " + desafiante.getNome());
                        desafiante.ganharLuta();
                        desafiado.perderLuta();
                        break;
            }
        }
        else{
            System.out.println("Luta não pode acontecer");
        }
        
    }    
}
