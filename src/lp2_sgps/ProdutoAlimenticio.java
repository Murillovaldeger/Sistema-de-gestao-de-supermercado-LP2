package lp2_sgps;

public class ProdutoAlimenticio extends Produto {
    private int diasValidade;

    public ProdutoAlimenticio(String nome, int codigoBarras, double precoBase, Fornecedor fornecedor, int diasValidade) {
        super(nome, codigoBarras, precoBase, fornecedor); 
        this.diasValidade = diasValidade;
    }

    @Override
    public double calcularPrecoFinal() {
        double precoComMargem = precoBase * 1.20;
        if (diasValidade <= 5) {
            return precoComMargem * 0.70; // Desconto 30%
        }
        return precoComMargem;
    }
}