package pizzaria.entities;
import javax.persistence.Entity;


@Entity
public class Bebida {
    private int idBebida, idFornecedor, quantidadeMl;
    private String nomeBebida, marca, tipo, alcoolico;
    private double preco;

    public Bebida(){}
    public Bebida(int idBebida, int idFornecedor, String nomeBebida, String marca, int quantidadeMl, String tipo, String alcoolico, double preco){
        this.idBebida = idBebida;
        this.idFornecedor = idFornecedor;
        this.nomeBebida = nomeBebida;
        this.marca = marca;
        this.quantidadeMl = quantidadeMl;
        this.tipo = tipo;
        this.alcoolico = alcoolico;
        this.preco = preco;
    }
}
