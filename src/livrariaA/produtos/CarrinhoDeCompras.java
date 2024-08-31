package livrariaA.produtos;

import java.util.ArrayList;

public class CarrinhoDeCompras {

    private double total;
    private ArrayList<Produto> produtos;
    
    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<Produto>();
        this.total = 0.0; // Inicializa o total em 0
    }
    
    public void adiciona(Produto produto) {
        this.produtos.add(produto);
        this.total += produto.getValor(); // Atualiza o total
    }
    
    public void remove(int posicao) {
        Produto produtoRemovido = this.produtos.remove(posicao);
        if (produtoRemovido != null) {
            this.total -= produtoRemovido.getValor(); // Atualiza o total ao remover o produto
        }
    }
    
    public double getTotal() {
        return total;
    }
    
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
}
