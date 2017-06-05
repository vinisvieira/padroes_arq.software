package viniciusLindembergDecorator.decorator;

import viniciusLindembergDecorator.component.LutadorUFC;

public abstract class Habilidades extends LutadorUFC {

	private LutadorUFC lutador;

	public Habilidades(String nome, double peso, LutadorUFC lutador) {
		super(nome, peso);
		this.lutador = lutador;
	}
	
	public LutadorUFC getLutador() {
		return lutador;
	}



	public void setLutador(LutadorUFC lutador) {
		this.lutador = lutador;
	}

	@Override
	public double habilidadeLuta() {
		
		return 0;
	}

	@Override
	public String configuracao() {

		return lutador.configuracao() + " +" + getNome() ;
	}

}
