package viniciusLindembergDecorator.concreteComponent;

import java.util.Random;

import viniciusLindembergDecorator.component.LutadorUFC;

public class AndresonSilva extends LutadorUFC {

	private Random habilidade = new Random();

	public AndresonSilva() {

		super("Andreson Silva", 80);
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