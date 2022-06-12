public class Biblioteca{

    public static void main(String[] args) {
        
        Emprestimo emprestimo = new Emprestimo();
        
       
        //efetuando um emprestimo
        System.out.print("Nome do usuario-> ");
        System.out.println(emprestimo.getUsuario().getNome());
        System.out.print("Data do emprestimo-> ");
        System.out.println(emprestimo.dataEmprestimo);
        System.out.print("Previsao de devolução-> ");
        System.out.println(emprestimo.dataPrevisaoDevolucao);
        System.out.print("Nome do livro-> ");
        System.out.println(emprestimo.getExemplar().getLivro().getTitulo());
        System.out.print("Codigo do exemplar-> ");
        System.out.println((emprestimo.getExemplar().codigo));

        
            
        
    }
}