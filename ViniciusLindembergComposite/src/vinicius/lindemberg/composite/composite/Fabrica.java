package vinicius.lindemberg.composite.composite;

public class Fabrica {
	private Refrigerante caminhao;
	private FuncionarioFabrica fulano = new FuncionarioFabrica();

	public Fabrica() {

		caminhao = new PaleteDeRefri();

		GarrafaDeRefri garrafaDeRefri1;
		GarrafaDeRefri garrafaDeRefri2;
		GarrafaDeRefri garrafaDeRefri3;
		GarrafaDeRefri garrafaDeRefri4;
		GarrafaDeRefri garrafaDeRefri5;
		GradeDeRefri gradeDeRefri;
		PaleteDeRefri paleteDeRefri;

		garrafaDeRefri1 = new GarrafaDeRefri("Coca-Cola", "30/10/2019");
		garrafaDeRefri2 = new GarrafaDeRefri("Coca-Cola", "30/10/2019");
		garrafaDeRefri3 = new GarrafaDeRefri("Coca-Cola", Util.getDateTime());
		garrafaDeRefri4 = new GarrafaDeRefri("Coca-Cola", "30/10/2019");
		garrafaDeRefri5 = new GarrafaDeRefri("Coca-Cola", "30/10/2019");

		gradeDeRefri = new GradeDeRefri();
		paleteDeRefri = new PaleteDeRefri();

		gradeDeRefri.criarRefri(garrafaDeRefri1);
		gradeDeRefri.criarRefri(garrafaDeRefri2);
		gradeDeRefri.criarRefri(garrafaDeRefri3);
		gradeDeRefri.criarRefri(garrafaDeRefri4);
		gradeDeRefri.criarRefri(garrafaDeRefri5);

		paleteDeRefri.criarRefri(gradeDeRefri);

		caminhao.criarRefri(paleteDeRefri);

		caminhao.refrigerantes();

		fulano.formaDeProducao(caminhao);
		fulano.produtosValidos(caminhao);

	}

}
