package pizzaria.entities.Usuarios;
import pizzaria.entities.Usuario;

public class Funcionario extends Usuario{
    private String horarioEntrada, horarioSaida;
    private double remuneracao;

    public Funcionario(int id, String nome, String cpf, String numeroCelular, String dtaNascimento, String horarioEntrada, String horarioSaida, double remuneracao){
        super(id, nome, cpf, numeroCelular, dtaNascimento);
        this.horarioEntrada = horarioEntrada; 
        this.horarioSaida = horarioSaida;
        this.remuneracao = remuneracao;
    }
}
