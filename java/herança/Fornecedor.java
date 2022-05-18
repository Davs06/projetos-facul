public class Fornecedor extends PessoaJuridica{
    private String oqueVende;
    
    //geters========================
    
    public String getOqueVende () {return this.oqueVende;}
    
    public Fornecedor (String vende,String cnpj,String nome,String endereco,String telefone){
        super(cnpj,nome,endereco,telefone); 
        this.oqueVende=vende;
    }
        
}