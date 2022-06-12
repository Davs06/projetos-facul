public class Emprestimo{
    String dataEmprestimo = "20/05" ;
    String dataPrevisaoDevolucao = "20/06";
    String dataEntregareal;
    int situacao;
    Usuario usuario = new Usuario();
    Exemplar exemplar = new Exemplar();

    public Usuario getUsuario(){
        return usuario;
    }
    public void setUsuario (Usuario usuario){
        this.usuario = usuario;
    }

    public Exemplar getExemplar(){
        return exemplar;
    }
    public void setExemplar (Exemplar exemplar){
        this.exemplar = exemplar;
    }





}