package banco;

public class Conta {
    private double saldo = 0.0;
    private double saque = 0.0;
    private double deposito = 0.0;
    
    
// geters =========================================================
    
    public double getSaldo (){
        return this.saldo;
    }
    
    public double getSaque (){
        return this.saque;
    }
    
    public double getDeposito (){
        return this.deposito;
    }
// seters =================================================
    
    public void setSaldo (double vSaldo){
        saldo = vSaldo; 
    }
    
    public void setSaque (double vSaque){
        saldo = saldo - vSaque; 
    }
    
    public void setDeposito (double vDeposito){
        saldo = saldo + vDeposito; 
    }
    
 //metodos ======================

   /* public boolean sacar ( double vlDoSaque) {
        if (saque <= this.saldo * 0.20) {            
            this.saldo = this.saldo - vlDoSaque;
        } 
        return false; 
    }
*/
}
