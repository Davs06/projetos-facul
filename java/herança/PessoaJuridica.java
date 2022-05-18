public class PessoaJuridica extends Pessoa {
    protected String cnpj;
     
     // geters ================================
     
     public String getCnpj () {return this.cnpj;}
     
    public PessoaJuridica (String cnpj,String nome,String endereco,String telefone){
        super(nome,endereco,telefone); 
        this.cnpj=cnpj;
    }
        
}