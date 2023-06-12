package pizzaria.entities.Usuarios;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import pizzaria.entities.Usuario;

@Entity
@DiscriminatorValue(value = "funcionario")
public class Funcionario extends Usuario{
    private String horarioEntrada, horarioSaida;
    private double remuneracao;

    public Funcionario(){}
    public Funcionario( String nome, String cpf, String numeroCelular, String dtaNascimento, String horarioEntrada, String horarioSaida, double remuneracao){
        super(nome, cpf, numeroCelular, dtaNascimento);
        this.horarioEntrada = horarioEntrada; 
        this.horarioSaida = horarioSaida;
        this.remuneracao = remuneracao;
    }
}
