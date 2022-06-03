public class ClienteEmpresa extends PessoaJuridica {
    private String revender;
    
    //geters======================================================
    
    public String getRevender () {return this.revender;}
    
    public ClienteEmpresa (String revender, String cnpj,String nome,String endereco,String telefone){
        super(cnpj,nome,endereco,telefone);
        this.revender = revender;
        }
}