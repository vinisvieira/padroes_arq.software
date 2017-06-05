package viniciusLindembergDecorator.classificacaoLutadores;

import viniciusLindembergDecorator.component.LutadorUFC;
import viniciusLindembergDecorator.concreteComponent.AndresonSilva;
import viniciusLindembergDecorator.concreteComponent.ConorMcGregor;
import viniciusLindembergDecorator.concreteComponent.JonJones;
import viniciusLindembergDecorator.concreteDecorator.Boxe;
import viniciusLindembergDecorator.concreteDecorator.Carate;
import viniciusLindembergDecorator.concreteDecorator.JiuJitsu;
import viniciusLindembergDecorator.concreteDecorator.Judo;
import viniciusLindembergDecorator.concreteDecorator.Taekwondo;

public class ClassificacaoLutadores {

	public void lutadores() {

		LutadorUFC andersonSilva = new AndresonSilva();

		andersonSilva = new Carate(andersonSilva);
		andersonSilva = new Judo(andersonSilva);
		andersonSilva = new Taekwondo(andersonSilva);
		andersonSilva = new Boxe(andersonSilva);

		LutadorUFC conorMcGregor = new ConorMcGregor();

		conorMcGregor = new JiuJitsu(conorMcGregor);
		conorMcGregor = new Judo(conorMcGregor);
		conorMcGregor = new Carate(conorMcGregor);
		conorMcGregor = new Taekwondo(conorMcGregor);

		LutadorUFC jonJones = new JonJones();

		jonJones = new Boxe(jonJones);
		jonJones = new Taekwondo(jonJones);
		jonJones = new Judo(jonJones);
		jonJones = new Carate(jonJones);

		classificacao(andersonSilva, conorMcGregor, jonJones);

	}

	public void classificacao(LutadorUFC andersonSilva, LutadorUFC conorMcGregor, LutadorUFC jonJones) {

		LutadorUFC[] habilidades = { andersonSilva, conorMcGregor, jonJones };

		for (LutadorUFC habilidade : habilidades) {

			System.out.println(habilidade.configuracao());
			System.out.println(habilidade.habilidadeLuta());
			System.out.println();
		}

	}

}