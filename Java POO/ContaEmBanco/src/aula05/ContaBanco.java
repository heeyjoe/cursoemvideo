/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author Victor
 */
public class ContaBanco {
    //Construtor
    //Nova conta: conta fechada e saldo zerado
    public void ContaBanco(){
        this.setStatus(false);
        this.setSaldo(0);
    }    
    
    
    public int numConta;
    protected String tipoConta; //CC conta corrente, CP conta poupança
    private String dono;
    private float saldo;
    private boolean status; //True aberta, False fechada
    
        
    //#MÉTODOS DA CLASSE    
    public void abrirConta(String nomeDono, String tipoConta){
        this.setTipoConta(tipoConta);
        this.setStatus(true);
        this.setDono(nomeDono);
       
        //Se for CC, a pessoa ganha R$50
        //Se for CP, a pessoa ganha R$150
        switch (tipoConta) {
            case "CC":
                this.setSaldo(50);
                //this.saldo = 50;
                break;
            case "CP":
                //this.saldo = 150;
                this.setSaldo(150);
                break;
            default:
                System.out.println("Não foi possível abrir conta. "
                        + "Tipo de Conta incorreto");
                break;
        }
    }
    public void fecharConta(){
        //Para fechar conta, não deve se ter nem débito nem crédito na conta
        if (this.getSaldo() > 0){
            System.out.println("Conta com dinheiro");
            this.sacar(this.getSaldo());
        }
        else if (this.getSaldo() < 0){
            System.out.printf("Não é possível fechar a conta."
                   + "Você possui um débito de R$" + this.getSaldo());       
        }
        else{
            this.setStatus(false);
            System.out.println("Conta encerrada com sucesso");
        }
    }  
    public void depositar(float valor){
        //Para depositar, a conta deve estar aberta
        //if(this.status == true){
            if(this.getStatus()){
            //this.saldo += valor;
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
        }
        else{
            System.out.println("Não é possível depositar nesta conta."
                   + "Conta encerrada");
        }
    }
    public void sacar(float valor){
        //Para sacar, a conta deve estar aberta e deve ter saldo
        //if(this.status == true){ 
            if(this.getStatus()){
            //O valor sacado deve ser menor que o saldo na conta
            //if(this.saldo > valor){
                if(this.getSaldo() >= valor){
                //this.saldo -= valor;
                this.setSaldo(getSaldo() - valor);
                System.out.println("Saque efetuado com sucesso da conta " + this.getDono());
            }
            else{
                System.out.println("Não é possível realizar o saque."
                        + "Saldo insuficiente.");
            }
        }
        else{
            System.out.println("Não é possível sacar nesta conta."
                   + "Conta encerrada");
        }
    }
    public void pagarMensal(){
        //Mensalidade deve ser cobrada quando chamar o método
        //CC = 12 reais, CP = 20 reais
        float mensalidade = 0; 
        
        switch (this.getTipoConta()) {
            case "CP":
                mensalidade = 20;
                break;
            case "CC":
                mensalidade = 12;
                break;
            default:
                System.out.println("Não foi possível realizar a cobrança "
                        + "da mensalidade para esta conta");
                break;
        }
        
              
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - mensalidade);
            System.out.println("Mensalidade debitada com sucesso.");
        }
        else{
            System.out.println("Não foi possível realizar a cobrança "
                        + "da mensalidade para esta conta");            
        }
    }
    
    public void estadoAtual(){
        System.out.println("-------------------------------");
        System.out.println("CONTA: " + this.getNumConta());
        System.out.println("TIPO: " + this.getTipoConta());
        System.out.println("DONO: " + this.getDono());
        System.out.println("SALDO: " + this.getSaldo());
        System.out.println("STATUS: " + this.getStatus());
        System.out.println("-------------------------------");
    }
    
    //MÉTODOS GETTERS E SETTERS
    public int getNumConta() {
        return this.numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipoConta() {
        return this.tipoConta;
    }
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
    public String getDono() {
        return this.dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public float getSaldo() {
        return this.saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public boolean getStatus() {
        return this.status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}
