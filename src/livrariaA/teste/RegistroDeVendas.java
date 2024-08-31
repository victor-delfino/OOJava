package livrariaA.teste;

import livrariaA.Autor;
import livrariaA.produtos.CarrinhoDeCompras;
import livrariaA.produtos.Ebook;
import livrariaA.produtos.LivroFisico;
import livrariaA.produtos.Produto;

import java.util.List;

public class RegistroDeVendas {

    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Mauricio");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");
        fisico.setValor(59.90);
        if (fisico.aplicaDescontoDe10Porcento()) {
            System.out.println("Valor agora é: " + fisico.getValor());
        }

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test-Driven Development");
        ebook.setValor(29.90);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);

        System.out.println("Total " + carrinho.getTotal());

        // Obter produtos como uma List
        List<Produto> produtos = carrinho.getProdutos();

        // Usar enhanced-for para iterar pelos produtos
        for (Produto produto : produtos) {
            System.out.println(produto.getNome()); // Este método agora está definido na interface Produto
        }
    }
}
