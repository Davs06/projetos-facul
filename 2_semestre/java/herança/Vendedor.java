public class Vendedor extends PessoaFisica {
    protected int nota;
    protected double comicao;
    protected int venda;
    protected String escolaridade;
    protected String horarioPessoa;
    
    //geters========================================================
    
    public int getNota () {return this.nota;}
    public double getComicao () {return this.comicao;}
    public int getVenda () {return this.venda;}
    public String getEscolaridade () {return this.escolaridade;}
    public String getHorarioPessoa () {return this.horarioPessoa;}
    
    public Vendedor (String escolaridade, int venda,double comicao,int nota,String cpf,String nome,String endereco,String telefone,String horario){
        super(cpf,nome,endereco,telefone); 
        this.nota=nota;
        this.comicao=comicao;
        this.venda=venda;
        this.escolaridade=escolaridade; 
        this.horarioPessoa=horario;
    }
        
}