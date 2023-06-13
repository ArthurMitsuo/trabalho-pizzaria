package pizzaria.entities.Usuarios;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import pizzaria.entities.Usuario;

@Entity
@DiscriminatorValue(value = "cliente")
public class Cliente extends Usuario {
    private String cep, logradouro;
    private int numero;

    public Cliente(){}
    public Cliente( String nome, String cpf, String numeroCelular, String dtaNascimento, String cep, String logradouro, int numero){
        super(nome, cpf, numeroCelular, dtaNascimento);
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
    }
}
