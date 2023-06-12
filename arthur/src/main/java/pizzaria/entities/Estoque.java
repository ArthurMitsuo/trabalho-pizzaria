package pizzaria.entities;

public class Estoque {
    private int idProduto, quantidadeUnidade, idFornecedor;
    private String nomeProduto;

    public Estoque(int idProduto, String nomeProduto, int quantidadeUnidade, int idFornecedor){
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.quantidadeUnidade = quantidadeUnidade;
        this. idFornecedor = idFornecedor;
    }
}
