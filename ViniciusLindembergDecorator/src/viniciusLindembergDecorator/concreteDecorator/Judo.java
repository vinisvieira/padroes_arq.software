package viniciusLindembergDecorator.concreteDecorator;

import viniciusLindembergDecorator.component.LutadorUFC;
import viniciusLindembergDecorator.decorator.Habilidades;

public class Judo extends Habilidades {

	public Judo(LutadorUFC lutador) {
		super("Judo", lutador.getOverall() + 1, lutador);

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