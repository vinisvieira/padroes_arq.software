package viniciusLindembergStrategy.competicao;

import java.util.ArrayList;

import viniciusLindembergStrategy.concreteStrategy.FlechaMagnetica;
import viniciusLindembergStrategy.concreteStrategy.TiroDuplo;
import viniciusLindembergStrategy.context.Arqueiro;
import viniciusLindembergStrategy.context.GaviaoArqueiro;
import viniciusLindembergStrategy.context.Hank;
import viniciusLindembergStrategy.context.KatnissEverdeen;

public class Competicao {

	private ArrayList<Arqueiro> competidores = new ArrayList<>();
	private FlechaMagnetica flechaMagnetica = new FlechaMagnetica();
	private TiroDuplo tiroDuplo = new TiroDuplo();

	public Competicao() {
		competidores.add(new GaviaoArqueiro());
		competidores.add(new Hank());
		competidores.add(new KatnissEverdeen());
	}

	public void start() {

		int[] posicao = new int[competidores.size()];

		System.out.println("Começa a Competição !!!!!");

		for (int i = 1; i <= 3; i++) {
			System.out.println("Round: " + (i));

			for (int j = 0; j < competidores.size(); j++) {
				Arqueiro arqueiro = competidores.get(j);
				posicao[j] += arqueiro.flecha(arqueiro);
				posicao[j] += arqueiro.tiro();

				// o Gavião Arqueiro por ser um heroi com um ego muito grande
				// nao aceita perder para ninguem
				// pois para ele, ele é o melhor arqueiro, entao ele vai para o
				// tudo ou nada e pega a flecha magnetica com o tiro duplo
				if (arqueiro instanceof GaviaoArqueiro && posicao[1] > posicao[0]) {

					arqueiro.setTipoFlecha(flechaMagnetica);
					arqueiro.setTipoTiro(tiroDuplo);
					System.out
							.println(arqueiro.getNome() + " Que Estava em ultimo Foi para o tudo ou nada e utilizou a "
									+ "Flecha Magnetica com o tiro duplo e sua pontuação foi para " + posicao[j]);
				}
				if (i == 3 && arqueiro instanceof Hank) {

					arqueiro.setTipoTiro(tiroDuplo);
					System.out.println("Na ultima rodada " + arqueiro.getNome()
							+ " Vai para flecha dupla independente de sua posição"
							+ " para tentar ganhar e sua pontuação foi " + posicao[j]);
				}
				System.out.println(arqueiro.getNome() + " com a pontuação " + posicao[j]);
			}
		}
	}
}