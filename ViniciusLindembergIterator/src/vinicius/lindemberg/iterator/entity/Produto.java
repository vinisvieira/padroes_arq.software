package vinicius.lindemberg.iterator.entity;

public class Produto {

	private String nome;
	private float valorProduto;
	private float valorFrete;

	public Produto(String nome, float valorProduto, float valorFrete) {

		setNome(nome);
		setValorFrete(valorFrete);
		setValorProduto(valorProduto);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(float valorProduto) {
		this.valorProduto = valorProduto;
	}

	public float getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(float valorFrete) {
		this.valorFrete = valorFrete;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", valorProduto=" + valorProduto + ", valorFrete=" + valorFrete + "]";
	}

}
