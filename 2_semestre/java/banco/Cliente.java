public class Cliente{
    
    protected String nome;
    protected int conta = 0;
    protected int agencia = 0;
    Conta cnta = new Conta(0,0,0);
    
    
// geters ***********************************************

    public Conta getCnta(){return cnta;}
    
    public String getNome (){return this.nome;}
    
    public int getConta (){return this.conta;}
    
    public int getAgencia (){return this.agencia;}
    
// seters **************************************************

    public void setCnta (Conta cnta){
        this.cnta = cnta;
    }
    
    public void setNome (String vNome){
        this.nome = vNome;
    }
    
    public void setConta (int vConta){
        this.conta = vConta;
    }
    
    public void setAgencia (int vAgencia){
        this.agencia = vAgencia; 
    }
}
