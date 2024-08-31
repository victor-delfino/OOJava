package livrariaA.produtos;

import livrariaA.Editora;

public class Revista implements Produto, Promocional {

    private String nome;
    private String descricao;
    private double valor;
    private Editora editora;

    // Construtor
    public Revista(String nome, String descricao, double valor, Editora editora) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.editora = editora;
    }

    @Override
    public boolean aplicarDescontoDe(double porcentagem) {
        if (porcentagem > 0.1) {
            return false; // Não aplica desconto maior que 10%
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        return true;
    }

    @Override
    public double getValor() {
        return valor;
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

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

	@Override
	public int compareTo(Produto o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
