package banco;

public class Cliente {
    
    private String nome;
    private int conta = 0;
    private int agencia = 0;
    
// geters =================

    public String getNome (){
        return nome;
    }
    
    public int getConta (){
        return conta;
    }
    
    public int getAgencia (){
        return agencia;
    }

// seters ========================

    public void setNome (String vNome){
        nome = vNome;
    }
    
    public void setConta (int vConta){
        conta = vConta;
    }
    
    public void setAgencia (int vAgencia){
        agencia = vAgencia; 
    }
    
}




    

