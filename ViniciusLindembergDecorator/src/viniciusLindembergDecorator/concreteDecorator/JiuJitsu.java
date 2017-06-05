package viniciusLindembergDecorator.concreteDecorator;

import viniciusLindembergDecorator.component.LutadorUFC;
import viniciusLindembergDecorator.decorator.Habilidades;

public class JiuJitsu extends Habilidades {

	public JiuJitsu(LutadorUFC lutador) {
		super("JiuJitsu", lutador.getOverall() + 5, lutador);

	}

	@Override
	public double habilidadeLuta() {

		double valor = getLutador().habilidadeLuta();
		return valor - ((valor * 0.1) - 10);
	}

	@Override
	public String configuracao() {
		// TODO Auto-generated method stub
		return null;
	}
}