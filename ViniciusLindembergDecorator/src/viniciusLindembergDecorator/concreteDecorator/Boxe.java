package viniciusLindembergDecorator.concreteDecorator;

import viniciusLindembergDecorator.component.LutadorUFC;
import viniciusLindembergDecorator.decorator.Habilidades;

public class Boxe extends Habilidades {

	public Boxe(LutadorUFC lutador) {
		super("Boxe", lutador.getOverall() + 2, lutador);

	}

	@Override
	public double habilidadeLuta() {

		double valor = getLutador().habilidadeLuta();
		return valor - (valor * 0.1);
	}

	@Override
	public String configuracao() {
		// TODO Auto-generated method stub
		return null;
	}
}