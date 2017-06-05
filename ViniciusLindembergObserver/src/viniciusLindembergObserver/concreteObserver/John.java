package viniciusLindembergObserver.concreteObserver;

import viniciusLindembergObserve.play.Play;
import viniciusLindembergObserver.observer.Kids;
import viniciusLindembergObserver.subject.Master;

public class John implements Kids {

	private Master master;

	public John(Master master) {

		this.master = master;
		this.master.getInPlay(this);
	}

	@Override
	public void play(Play play) {

		if (play.getFazerOque().equals("Subam na Arvore da Esquina")) {
			System.out.println("John: Ai não dar, Passou do meu limite, Estou fora :(");
			master.getOutPlay(this);
		} else {
			System.out.println("John: Or, Moleza, Tem nada mais dificil não ?");
		}
	}
}