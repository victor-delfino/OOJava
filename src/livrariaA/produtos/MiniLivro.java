package livrariaA.produtos;

import livrariaA.Autor;

public class MiniLivro extends Livro {
    
    public MiniLivro(Autor autor) {
        super(autor);
    }
    
    // Método para aplicar desconto de até 30%
    @Override
    public boolean aplicarDescontoDe(double porcentagem) {
        if (porcentagem > 0.3) {
            return false;
        }
        double desconto = this.getValor() * porcentagem;
        this.setValor(this.getValor() - desconto);
        return true;
    }
    
    @Override
    public int compareTo(Produto outro) {
        return Double.compare(this.getValor(), outro.getValor());
    }
}
