package livrariaA.produtos;

import livrariaA.Autor;

public class Ebook extends Livro implements Promocional {

	private String waterMark;
	
	public Ebook(Autor autor) {
		super(autor);
	}
	
	@Override
	public boolean aplicarDescontoDe(double porcentagem) {
		if(porcentagem > 0.15) {
			return false;
		} 
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		System.out.println("Aplicando desconto no Ebook");
		return true;
	}
	
	public String getWaterMark() {
		return waterMark;
	}
	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}

	@Override
	public String toString() {
		return "Eu sou um Ebook";
	}
	@Override
	public int compareTo(Produto outro) {
	    return Double.compare(this.getValor(), outro.getValor());
	}

}
