package viniciusLindembergObserver.concreteObserver;

import viniciusLindembergObserve.play.Play;
import viniciusLindembergObserver.observer.Kids;
import viniciusLindembergObserver.subject.Master;

public class Oscar implements Kids {

	private Master master;

	public Oscar(Master master) {

		this.master = master;
		this.master.getInPlay(this);
	}

	@Override
	public void play(Play play) {

		if (play.getFazerOque().equals("Dancem na frente de estranhos")) {
			System.out.println("Oscar: Ai não dar, tenho vergonha, Estou fora :(");
			master.getOutPlay(this);
		} else {
			System.out.println("Oscar: Ok, Vou fazer isso!");
		}
	}
}