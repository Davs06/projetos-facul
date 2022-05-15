package clintes;

public class ClienteUm {

    private int id = 1; 
    private int idade;
    private String nome;
    private String endereco;
    private String telefone;
    


    // getters ------------------------------------------

    public int getId (){
        return id;
    }
    public int getIdade (){
        return idade;
    }
    public String getNome (){
        return nome;
    }
    public String getEndereço (){
        return endereco;
    }
    public String getTelefone (){
        return telefone;
    }

    // seters ---------------------------------------------------

    public void setIdade (int vIdade ){
        idade = vIdade;
    }
    public void setNome (String vNome ){
        nome = vNome;
    }
    public void setEndereço (String vEndereço ){
        endereco = vEndereço;
    }
    public void setTelefone (String vTelefone ){
       telefone = vTelefone;
    }
}
