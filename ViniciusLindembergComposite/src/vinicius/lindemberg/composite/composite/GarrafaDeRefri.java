package vinicius.lindemberg.composite.composite;

public class GarrafaDeRefri extends Refrigerante {

	private String marca;
	private String dataDeValidade;

	public GarrafaDeRefri(String marca, String dataDeValidade) {

		this.marca = marca;
		this.dataDeValidade = dataDeValidade;

	}

	@Override
	public String getDataValidade() {
		return this.dataDeValidade;
	}

	@Override
	public void refrigerantes() {
		System.out.println("Marca: " + this.marca + " Data Validade " + this.dataDeValidade);
	}

	@Override
	public boolean isValid() {
		if (getDataValidade().equals(Util.getDateTime())) {
			System.out.println("to aqui");
			return false;
		} else {
			System.out.println("to aqui 2");
			return true;
		}
	}
}