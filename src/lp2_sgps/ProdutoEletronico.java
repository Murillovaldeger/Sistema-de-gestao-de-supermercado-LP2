package lp2_sgps;

public class ProdutoEletronico extends Produto {
    private int mesesGarantia;

    public ProdutoEletronico(String nome, int codigoBarras, double precoBase, Fornecedor fornecedor, int mesesGarantia) {
        super(nome, codigoBarras, precoBase, fornecedor); 
        this.mesesGarantia = mesesGarantia;
    }

    @Override
    public double calcularPrecoFinal() {
        double precoComMargem = precoBase * 1.50;
        if (mesesGarantia > 12) {
            return precoComMargem * 1.15; // Taxa de 15%
        }
        return precoComMargem;
    }
}