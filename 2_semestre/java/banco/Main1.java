package banco;

import java.util.Scanner;

public class Main1{
    
    public static void main(String[] args){
        
        //instanciando classes 
        Cliente cln = new Cliente();
        Conta cnt = new Conta();
        try (Scanner sc1 = new Scanner(System.in)) {
            // menu de acesso
         /*  System.out.println("Entre com seu nome");
            cln.setNome(sc1.next());
            System.out.println("Entre com sua agencia 'sem o digito'" );
            cln.setAgencia(sc1.nextInt());
            System.out.println("Entre com sua conta 'sem o digito'");
            cln.setConta(sc1.nextInt()); */

            
            int a = 1;
      while (a <=8 ){

            // menu do banco 
            System.out.println("Escolha a opção que deseja");
            System.out.println("Opção [1] - Saldo");
            System.out.println("Opção [2] - Deposito");
            System.out.println("Opção [3] - Saque");
            System.out.println("Opção [4] - Dados da conta corrente");
            System.out.println("Deseja finalizar o programa? [5]");
            
            int opc = sc1.nextInt();
            switch(opc) {
               
                case 1: System.out.println("O seu saldo é:" + cnt.getSaldo()); break; 
               
                case 2 : System.out.println("Digite o valor que deseja depositar ");
                cnt.setDeposito(sc1.nextDouble());
                System.out.println("Deposito no valor de " + cnt.getDeposito() + "Seu saldo é = " + cnt.getSaldo()); break;
                
                case 3 : System.out.println("Digite o valor que deseja sacar ");
                cnt.setSaque(sc1.nextDouble());
                if(cnt.getSaque() <= cnt.getSaldo()){
                    System.out.println("Saque no valor de " + cnt.getSaque() + " Seu saldo é = " + cnt.getSaldo()); break;
                }else{
                    System.out.println("Você não tem saldo o suficiente "); break;
                }
                
                case 4 : System.out.println(cln.getNome());
                System.out.println("Numero da Agencia " + cln.getAgencia());
                System.out.println("Numero da Conta " + cln.getConta()); break;

                case 5 : a = a + 100; break;
               
                default : System.out.println("Opção invalida");
            }

      }
        }     
        
    }
    
} 