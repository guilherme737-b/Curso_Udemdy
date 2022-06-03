public class Conta {

    private String nome;
    private Integer conta;
    private Double cpf;



    public String nomeCadastrado(){
        return this.nome;
    }

    public void cadastrarNome (String nome){
        this.nome = nome;
    }


}
