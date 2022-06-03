public class Pessoa {
    protected String nomePessoa;
    protected String enderecoPessoa;
    protected String telefonePessoa;
    
    
    //geters==================================
    public String getNomePessoa (){return this.nomePessoa;}
    public String getEnderecoPessoa() {return this.enderecoPessoa;}
    public String getTelefonePessoa () {return this.telefonePessoa;}
    
    
    public Pessoa (String nome,String endereco,String telefone){
        this.nomePessoa=nome;
        this.enderecoPessoa=endereco;
        this.telefonePessoa=telefone;
        
        
    }
}