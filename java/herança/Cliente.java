public class Cliente extends PessoaFisica {
    private String nivelFidelidade;
    private String escolhaDeProduto;
    
    //geters=======================================================================================
    
    public String getNivelFidelidade(){return this.nivelFidelidade;}
    public String getEscolhaDeProduto(){return this.escolhaDeProduto;}
    
    public Cliente (String nivelFidelidade,String escolhaDeProduto,String cpf,String nome,String endereco,String telefone){
        super(cpf,nome,endereco,telefone); 
        this.nivelFidelidade=nivelFidelidade;
        this.escolhaDeProduto=escolhaDeProduto;
    }
        
}