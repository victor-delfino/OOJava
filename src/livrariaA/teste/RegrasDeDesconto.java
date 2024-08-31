package livrariaA.teste;

import livrariaA.Autor;
import livrariaA.produtos.Livro;
import livrariaA.produtos.MiniLivro;

public class RegrasDeDesconto {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Vitin");
		
		Livro livro = new MiniLivro(autor);
		livro.setValor(39.90);
		
		if(!livro.aplicarDescontoDe(0.3)) {
			System.out.println("Desconto não pode ser maior que 30%");
		} else {
			System.out.println("Valor com desconto: " + livro.getValor());
		}
		
	}

}
