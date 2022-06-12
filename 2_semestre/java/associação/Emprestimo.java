public class Emprestimo{
    String dataEmprestimo = "20/05" ;
    String dataPrevisaoDevolucao;
    String dataEntregareal;
    int situacao;
    Usuario usuario = new Usuario();
    Exemplar exemplar;

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