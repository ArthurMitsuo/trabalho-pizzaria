package pizzaria.entities.Usuarios;s
import pizzaria.entities.Usuario;


public class Cliente extends Usuario {
    private String cep, logradouro;
    private int numero;
    public Cliente(int id, String nome, String cpf, String numeroCelular, String dtaNascimento, String cep, String logradouro, int numero){
        super(id, nome, cpf, numeroCelular, dtaNascimento);
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
    }
}
