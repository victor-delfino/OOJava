package livrariaA.produtos;

import livrariaA.Autor;

public class LivroFisico extends Livro implements Promocional {
	
	public LivroFisico(Autor autor) {
		super(autor);
	}
	
	public double getTaxaImpressao() {
		return this.getValor() * 0.05;
	}
	
	public boolean aplicarDescontoDe(double porcentagem) {
		if(porcentagem > 0.3) {
			return false;
		}
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		System.out.println("Aplicando desconto no LivroFisico");
		return true;
	}
	@Override
	public int compareTo(Produto outro) {
	    return Double.compare(this.getValor(), outro.getValor());
	}

}
