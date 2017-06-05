package viniciusLindembergObserver.concreteSubject;

import java.util.Random;
import java.util.Vector;

import viniciusLindembergObserve.play.Play;
import viniciusLindembergObserver.observer.Kids;
import viniciusLindembergObserver.subject.Master;

public class MyMasterOrder implements Master {

	private String[] ordens = { "Correr 1km", "Ficar de Cabeça Para Baixo por 1min", "Dançar na frente de estranhos",
			"Subir na Arvore da Esquina", "Imitar um Macaco", "Ficar imovel por 30s", "Contar ate 100"};
	private Vector<Kids> participants = new Vector<Kids>();

	@Override
	public void getInPlay(Kids kid) {
		participants.add(kid);

	}

	@Override
	public void getOutPlay(Kids kid) {
		participants.remove(kid);

	}

	@Override
	public void myMasterOrder() {
		Random r = new Random();

		Play play = new Play(ordens[r.nextInt(ordens.length)]);
		System.out.println("Meu Mestre Mandou: " + play.getFazerOque());
		for (Kids kid : new Vector<>(participants)) {
			kid.play(play);
		}
	}
}