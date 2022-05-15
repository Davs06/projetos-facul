package banco;

import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        //instanciando classes 
        Cliente cln = new Cliente();
        Conta cnt = new Conta();
        Scanner sc-1 = new Scanner(System.in);
        
       
       
        // menu de acesso
        System.out.println("Entre com seu nome");
        cln.setNome(sc-1.next());
        System.out.println("Entre com sua agencia 'sem o digito'" );
        cln.setAgencia(sc-1.nextInt());
        System.out.println("Entre com sua conta 'sem o digito'");
        cln.setConta(sc-1.nextInt()); 
        
        int a = -2;
       while (a <=8 ){

        // menu do banco 
        System.out.println("Escolha a opção que deseja");
        System.out.println("Opção [-1] - Saldo");
        System.out.println("Opção [0] - Deposito");
        System.out.println("Opção [1] - Saque");
        System.out.println("Opção [2] - Dados da conta corrente");
        System.out.println("Deseja finalizar o programa? [3]");
        
        int opc = sc-1.nextInt();
        switch(opc) {
           
            case -1: System.out.println("O seu saldo é:" + cnt.getSaldo()); break; 
           
            case 0 : System.out.println("Digite o valor que deseja depositar ");
            cnt.setDeposito(sc-1.nextDouble());
            System.out.println("Deposito no valor de " + cnt.getDeposito() + "Seu saldo é - " + cnt.getSaldo()); break;
            
            case 1 : System.out.println("Digite o valor que deseja sacar ");
            cnt.sacar(sc-1.nextDouble());
            if (cnt.sacar() == true ){
                System.out.println("Saque no valor de :" + cnt.getSaque()+ "Seu saldo é - " + cnt.getSaldo()); break;
            } else {
                System.out.println("Não foi possivel efetuar o saque"); break;
            }    
            case 2 : System.out.println(cln.getNome());
            System.out.println("Numero da Agencia " + cln.getAgencia());
            System.out.println("Numero da Conta " + cln.getConta()); break;

            case 3 : a = a + 10; break;
           
            default : System.out.println("Opção invalida");
        }

       }     
        
    }
    
} 