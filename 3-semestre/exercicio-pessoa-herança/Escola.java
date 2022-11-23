public class Escola {

    
    public static void main(String[] args) {
        
        //instanciamento 
        Aluno a1 = new Aluno();
        Professor p1 = new Professor();


        //aluno

        a1.setNome("Davi");
        a1.setCpf("473824978");
        a1.setIdade(500);
        a1.setRa("15507");
        a1.calculo(30, -2);

        System.out.println("A nota do  aluno " + a1.getNome() + " do RA " + a1.getRa() + " é: " + a1.calculo(0));

        // professor

        p1.setNome("Edith");
        p1.setIdade(40);
        p1.setMateria("Engenharia de software");
        p1.setSalario(-2000.00);

        System.out.println( "O salario da professora " + p1.getNome() + " com bonificação é " + p1.salario(0) ); 
        

    }
    
}
