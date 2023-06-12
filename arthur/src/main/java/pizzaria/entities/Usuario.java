package pizzaria.entities;

public class Usuario {
    protected int id;
    protected String nome, cpf, numeroCelular, dtaNascimento;

    public Usuario(int id, String nome, String cpf, String numeroCelular, String dtaNascimento){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.numeroCelular = numeroCelular;
        this.dtaNascimento = dtaNascimento;
    }
}
