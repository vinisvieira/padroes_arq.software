package viniciusLindembergDecorator.concreteDecorator;

import viniciusLindembergDecorator.component.LutadorUFC;
import viniciusLindembergDecorator.decorator.Habilidades;

public class Taekwondo extends Habilidades {

	public Taekwondo(LutadorUFC lutador) {
		super("Taekwondo", lutador.getOverall() + 3, lutador);

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