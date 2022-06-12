class Exemplar {
    int codigo = 45;
    boolean cativa;
    boolean emprestada;
    Livro livro = new Livro();

    public Livro getLivro(){
        return livro;
    }
    public void setLivro(Livro livro){
        this.livro=livro;
    }
}