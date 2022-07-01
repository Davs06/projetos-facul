public class Conta{
    
    private double saldo = 0.0;
    private double saque = 0.0;
    private double deposito = 0.0;
    
    
// geters **************************************

    public double getSaldo (){return this.saldo;}
    
    public double getSaque (){return this.saque;}
    
    public double getDeposito (){return this.deposito;}
    
    
// seters ************************************

    public void setSaldo (double vSaldo){
        
        this.saldo = vSaldo;
    }
    
    public void setSaque (double vSaque){
        
        this.saldo = this.saque - vSaque;
    }
    
    public void setDeposito (double vDeposito){
        
        this.saldo = this.saldo + vDeposito;
    }

// parte da herança ***************************   

    public Conta (double saldo, double saque, double deposito){
        
        this.saldo = saldo;
        this.saque = saque;
        this.deposito = deposito;
        
    }
}