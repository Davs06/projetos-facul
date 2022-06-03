public class GerenteDeVendas extends Vendedor {
    private String cargo;
    
    //geters====================
    
    public String getCargo () {return this.cargo;}
    
    public GerenteDeVendas (String cargo,String escolaridade, int venda,double comicao, int nota,String cpf,String nome,String endereco,String telefone,String horario){
        super(escolaridade,venda,comicao,nota,cpf,nome,endereco,telefone,horario); 
        this.cargo=cargo;
    }
        
}