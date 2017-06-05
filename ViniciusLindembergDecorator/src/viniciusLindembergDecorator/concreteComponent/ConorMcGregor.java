package viniciusLindembergDecorator.concreteComponent;

import java.util.Random;

import viniciusLindembergDecorator.component.LutadorUFC;

public class ConorMcGregor extends LutadorUFC {

	private Random habilidade = new Random();

	public ConorMcGregor() {

		super("Conor McGregor", 77);
	}

	@Override
	public double habilidadeLuta() {

		return getOverall() * (habilidade.nextInt(3) + 1);
	}

	@Override
	public String configuracao() {

		return " || " + getNome() + " || " + getOverall() + " || ";
	}
}