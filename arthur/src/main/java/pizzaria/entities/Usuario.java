package pizzaria.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    protected String nome, cpf, numeroCelular, dtaNascimento;

    public Usuario(){}
    public Usuario(String nome, String cpf, String numeroCelular, String dtaNascimento){
        this.nome = nome;
        this.cpf = cpf;
        this.numeroCelular = numeroCelular;
        this.dtaNascimento = dtaNascimento;
    }
}
