/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaencapsulamento;

/**
 *
 * @author Victor
 */
public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    //getters e setters
    private int getVolume() {
        return this.volume;
    }
    private void setVolume(int volume) {
        this.volume = volume;
    }
    private boolean getLigado() {
        return this.ligado;
    }
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    private boolean getTocando() {
        return this.tocando;
    }
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //OUTROS MÉTODOS
    @Override
    public void ligar(){
        this.setLigado(true);
    }
    @Override
    public void desligar(){
        this.setLigado(false);
    }
    @Override
    public void abrirMenu(){
        System.out.println("-------- MENU ----------");
        System.out.println("Ligado? " + this.getLigado());
        System.out.println("Tocando? " + this.getTocando());
        System.out.print("Volume: ");
        for (int i = 0; i < this.getVolume(); i+=10){
            System.out.print(" * ");
        }
        System.out.println(this.getVolume());
        System.out.println("-----------------------");
    }
    
    @Override
    public void fecharMenu(){
        System.out.println("Fechando menu . . .");
    }
    
    @Override
    public void maisVolume(){
        if(this.getLigado()){
            this.setVolume(this.getVolume() + 1);
        }
    }
    
    @Override
    public void menosVolume(){
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 1);
        }
    }
    
    @Override
    public void ligarMudo(){
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }
    
    @Override
    public void desligarMudo(){
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }
    
    @Override
    public void play(){
        if(this.getLigado() && !(this.getTocando()) ){
            this.setTocando(true);
        }
    }
    @Override
    public void pause(){
        if(this.getLigado() && this.getTocando() ){
            this.setTocando(false);
        }
    }    
}
