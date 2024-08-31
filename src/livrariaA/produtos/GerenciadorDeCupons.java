package livrariaA.produtos;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeCupons {
	
	private Map<String, Double> cupons;
	
	public GerenciadorDeCupons() {
		
		this.cupons = new HashMap<>();
		
		this.cupons.put("CUP74", 10.0);  // Exemplo de desconto de 10%
        this.cupons.put("CUP75", 15.0);  // Exemplo de desconto de 15%
        this.cupons.put("CUP76", 20.0);  // Exemplo de desconto de 20%
        this.cupons.put("CUP77", 5.0);   // Exemplo de desconto de 5%
        this.cupons.put("CUP78", 25.0);  // Exemplo de desconto de 25%
        this.cupons.put("CUP79", 30.0);  // Exemplo de desconto de 30%
        this.cupons.put("CUP80", 12.0);  // Exemplo de desconto de 12%
        this.cupons.put("CUP81", 8.0);   // Exemplo de desconto de 8%
        this.cupons.put("CUP82", 18.0);  // Exemplo de desconto de 18%
        this.cupons.put("CUP83", 22.0);  // Exemplo de desconto de 22%
	}
	public Double validaCupom(String cupom) {
		return this.cupons.get(cupom);
	}
	
}
