package viniciusLindembergDecorator.component;

public abstract class LutadorUFC {

	private String nome;
	private double overall;

	public LutadorUFC(String nome, double overall) {

		setNome(nome);
		setOverall(overall);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getOverall() {
		return overall;
	}

	public void setOverall(double overall) {
		this.overall = overall;
	}

	public abstract double habilidadeLuta();

	public abstract String configuracao();

}