package livrariaA.teste;

import livrariaA.Autor;
import livrariaA.produtos.Livro;
import livrariaA.produtos.LivroFisico;

public class CadastroDeLivros {

	public static void main(String[] args) {
		
		Autor autor = new Autor(); 
		autor.setNome("Vitin");
		autor.setEmail("vivi.123@hotmail.com");
		autor.setCpf("123.456.789.10");
		
		Livro livro = new LivroFisico(autor);
		livro.setNome("java 8 Prático");
		livro.setDescricao("Novos recursos da linguagem");
		livro.setValor(59.90);
		livro.setIsbn("978-85-66250-46-6");
		
		livro.mostrarDetalhes();
		
		Autor outroAutor = new Autor(); 
		outroAutor.setNome("Rogério");
		outroAutor.setEmail("roro3@hotmail.com");
		outroAutor.setCpf("123.486.789.10");
		
		Livro outroLivro = new LivroFisico(outroAutor);
		outroLivro.setNome("Lógica de Programação");
		outroLivro.setDescricao("Crie e inove");
		outroLivro.setValor(59.90);
		outroLivro.setIsbn("978-85-66250-22-0");
		
		outroLivro.mostrarDetalhes();

	}

}
