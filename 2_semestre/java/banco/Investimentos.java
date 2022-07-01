public class Investimentos extends Conta {
    
    private String tipoAcao;
    private int quantidadeAcao;
   // private double valorAcao;
    

// geters ****************************************

    public String getTipoAcao(){return this.tipoAcao;}
    
    public int getQuantidadeAcao(){return this.quantidadeAcao;}
    
    //public double getValorAcao(){return this.valorAcao;}
    
    
// seters********************************************

    public void setTipoAcao (String tipoAcao1){
        
        this.tipoAcao = tipoAcao1;
    }
    
    public void setQuantidadeAcao (int quantidadeAcao1){
        
        this.quantidadeAcao = quantidadeAcao1;
    }
    

    


// parte herança ***********************************    
    public Investimentos (String tipoAcao, int quantidadeAcao, double saldo, double saque, double deposito  /*, double valorAcao*/){
        super (saldo, saque, deposito);
        
        this.tipoAcao = tipoAcao;
        this.quantidadeAcao = quantidadeAcao;
       // this.valorAcao = valorAcao;
    }
    
}