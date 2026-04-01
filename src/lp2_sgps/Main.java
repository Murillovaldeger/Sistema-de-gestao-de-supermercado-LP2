package lp2_sgps;

public class Main {
	
    public static void main(String[] args) {
    	
        // 1. Fornecedores 
        Fornecedor fazenda = new Fornecedor("Fazenda próxima", "543-9", "Brasil");
        Fornecedor mvcel = new Fornecedor("Loja de Iphone", "040-2", "Brasil");

        // 2. Produtos
        // Produto com validade curta → recebe desconto
        Produto bandejaovos = new ProdutoAlimenticio("Ovos de granja", 501, 20.00, fazenda, 4); // Com desconto
        // Produto com garantia estendida → recebe taxa extra
        Produto celular = new ProdutoEletronico("Iphone", 114, 5000.00, mvcel, 18); // Com garantia estendida

        // 3. Carrinho
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem(bandejaovos);
        carrinho.adicionarItem(celular);

        // 4. Resultado
        carrinho.processarCompra();
    }
}