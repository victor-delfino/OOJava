package livrariaA.produtos;

public interface Produto extends Comparable<Produto> {
	
	double getValor();

	String getNome();

	
}
