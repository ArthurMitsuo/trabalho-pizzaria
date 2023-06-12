package pizzaria.entities;
import javax.persistence.Entity;

@Entity
public class Fornecedor {
    private int idFornecedor, quantidade;
    private String nomeFornecedor, cnpj, nomeProduto, dataEntrega;
    private double preco;

    public Fornecedor(){}
    public Fornecedor(int idFornecedor, int quantidade, String nomeFornecedor, String cnpj, String nomeProduto,
            String dataEntrega, double preco) {
        this.idFornecedor = idFornecedor;
        this.quantidade = quantidade;
        this.nomeFornecedor = nomeFornecedor;
        this.cnpj = cnpj;
        this.nomeProduto = nomeProduto;
        this.dataEntrega = dataEntrega;
        this.preco = preco;
    }
}
