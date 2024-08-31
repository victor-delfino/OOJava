package livrariaA.produtos;

import livrariaA.Autor;

public abstract class Livro implements Produto, Promocional {
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	
	 
	public Livro(Autor autor) {
		
		if(autor == null) {
			throw new RuntimeException(
					"O autor do livro não pode ser nulo");
		}
		this.autor = autor;
		this.isbn = "000-00-00000-00-0";
	}
	
	public Livro() {
		this.isbn = "000-00-00000-00-0";
	}
	
	public void mostrarDetalhes() {
		System.out.println("Mostrando detalhes do livro ");
		System.out.println("Nome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("ISBN: " + isbn);
		if (this.temAutor()) {
        autor.mostrarDetalhes();
        } else {
            System.out.println("Detalhes do autor não disponíveis.");
        }
		System.out.println("--");
	}
	
	@Override
	public String toString() {
	    return "Nome: " + nome + "\n" +
	           "Descrição: " + descricao + "\n" +
	           "Valor: " + valor + "\n" +
	           "ISBN: " + isbn + "\n" +
	           (this.temAutor() ? autor.toString() : "Detalhes do autor não disponíveis.") + "\n" +
	           "--";
	}

		
	boolean temAutor(){
		return this.autor != null;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	};

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	@Override
	public int compareTo(Produto outro) {
	    return Double.compare(this.getValor(), outro.getValor());
	}


}

