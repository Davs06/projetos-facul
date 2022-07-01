
import java.util.Scanner;

public class Banco{
    
	public static void main(String[] args) {
		
		
		// instanciando classes
        Cliente cln = new Cliente();
        Scanner sc1 = new Scanner(System.in);
        
        
        
        // menu de acesso
        System.out.println("Entre com seu nome");
        cln.setNome(sc1.next());
        System.out.println("Entre com sua agencia 'sem o digito'");
        cln.setAgencia(sc1.nextInt());
        System.out.println("Entre com sua conta 'sem o digito'");
        cln.setConta(sc1.nextInt());
        
        int a = 1;
        while (a <= 8) {
        
        
            // menu do banco
            System.out.println("Escolha a opção que deseja");
            System.out.println("Opção [1] - Saldo");
            System.out.println("Opção [2] - Deposito");
            System.out.println("Opção [3] - Saque");
            System.out.println("Opção [4] - Investimentos");
            System.out.println("opção [5] - Dados da conta");
            System.out.println("Deseja sair da conta? [6]");

            int opc = sc1.nextInt();
            switch (opc) {

                case 1:
                    System.out.println("O seu saldo é:" + cln.cnta.getSaldo());break;

                case 2:
                    System.out.println("Digite o valor que deseja depositar ");
                    cln.cnta.setDeposito(sc1.nextDouble());
                    System.out.println("Deposito no valor de " + cln.cnta.getDeposito() + "Seu saldo é = " + cln.cnta.getSaldo()); break;

                case 3:
                    System.out.println("Digite o valor que deseja sacar ");
                    cln.cnta.setSaque(sc1.nextDouble());
                
                    if(cln.cnta.getSaque() < cln.cnta.getSaldo()){
                        System.out.println("Saque no valor de " + cln.cnta.getSaque() + "Seu saldo é = " + cln.cnta.getSaldo()); break;    
                    }else{
                        System.out.println("Você não tem saldo suficiente");
                        cln.cnta.setSaque(0) ; break;
                    }
                
               /* case 4:
                    int invest = 0;
                    System.out.println("Qual tipo de Investimento você deseja realiar ?");
                    System.out.println("Tesouro direto R$ 20,00 - Opção [1]");
                    System.out.println("Bolsa de valores R$ 50,00 - Opção [2]");
                    invest = sc1.nextInt();
                    }*/
                    
                
                case 5:
                    System.out.println(cln.getNome());
                    System.out.println("Numero da Agencia " + cln.getAgencia());
                    System.out.println("Numero da Conta " + cln.getConta()); break;

                case 6:
                    a = a + 100;break;

                default:
                    System.out.println("Opção invalida");
            }
        }
	}
}