package clintes;
import java.util.Scanner;

public class Main {

  public static void main (String[] args){
    // instanciando classes 
    ClienteUm c1 = new ClienteUm();
    ClienteDois c2 = new ClienteDois();
    Scanner fafa = new Scanner(System.in); 
        
    /** 
    *c1.nome = fafa.next();    
    *System.out.println(c1.nome());
    *c2.nome = fafa.next(); 
    *System.out.println(c2.nome);
    *
    *Nesse caso acontece um erro pois as variaveis do cliente um são privadas 
    */

    System.out.println("Entre com os dados do cliente 1-  ");
    // Entrada de dados cliente 1 ------------------------------------------------
    System.out.println("Digite o Nome do cliente ");
    c1.setNome(fafa.next());      
    System.out.println("Digite a  Idade do cliente ");
    c1.setIdade(fafa.nextInt());
    System.out.println("Digite o Telefone do cliente --> EX (xx)xxxxx-xxxx  ");
    c1.setTelefone(fafa.next());
    System.out.println("Digite o Endereço do cliente ");
    c1.setEndereço(fafa.next());

    //entrada de dados cliente 2 ------------------------------------------------
    System.out.println("Entre com os dados do Cliente 2");
    System.out.println("Digite o Nome do CLiente");
    c2.nome = fafa.next();
    System.out.println("Digite a Idade do CLiente");
    c2.idade = fafa.nextInt();
    System.out.println("Digite o Telefone do CLiente");
    c2.telefone = fafa.next();
    System.out.println("Digite o Endereço do CLiente");
    c2.endereço = fafa.next();

    // saida de dados cliente 1 ------------------------------------------------------
    System.out.println("Os dados do cliente 1  são = ");
    System.out.println("Id "+ c1.getId());
    System.out.println("Nome: " + c1.getNome());
    System.out.println("Idade: " + c1.getIdade() + " anos");
    System.out.println("Telefone: " + c1.getTelefone());
    System.out.println("Endereço: " + c1.getEndereço());

    // saida de dados cliente 1 ------------------------------------------------------
    System.out.println("Os dados do cliente 1  são = ");
    System.out.println("Id "+ c2.id);
    System.out.println("Nome: " + c2.nome);
    System.out.println("Idade: " + c2.idade + " anos");
    System.out.println("Telefone: " + c2.telefone);
    System.out.println("Endereço: " + c2.endereço);
  
  }

}
