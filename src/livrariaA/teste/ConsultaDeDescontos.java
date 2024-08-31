package livrariaA.teste;

import livrariaA.produtos.GerenciadorDeCupons;

public class ConsultaDeDescontos {

	public static void main(String[] args) {
		
		GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();
		
		Double desconto = gerenciador.validaCupom("CUP77");
		if(desconto != null) {
			System.out.println("Cupom válido. ");
			System.out.println("valor " + desconto);
		} else {
			System.out.println("Esse cupom não existe.");
		}
	}

}
