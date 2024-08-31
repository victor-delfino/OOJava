package livrariaA.produtos;

@FunctionalInterface
public interface Promocional {
	
	boolean aplicarDescontoDe(double porcentagem);
	
	default boolean aplicaDescontoDe10Porcento() {
		return aplicarDescontoDe(0.1);
	}
}
