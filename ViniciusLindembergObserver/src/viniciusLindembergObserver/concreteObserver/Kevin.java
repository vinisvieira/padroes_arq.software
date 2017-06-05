package viniciusLindembergObserver.concreteObserver;

import viniciusLindembergObserve.play.Play;
import viniciusLindembergObserver.observer.Kids;
import viniciusLindembergObserver.subject.Master;

public class Kevin implements Kids {

	private Master master;

	public Kevin(Master master) {

		this.master = master;
		this.master.getInPlay(this);
	}

	@Override
	public void play(Play play) {

		if (play.getFazerOque().equals("Fiquem de Cabe�a Para Baixo por 1min")) {
			System.out.println("Kevin: Isso n�o fa�o, pra mim deu :(");
			master.getOutPlay(this);
		} else {
			System.out.println("Kevin: S� isso ? tem nada mais dificil n�o ?");
		}
	}
}