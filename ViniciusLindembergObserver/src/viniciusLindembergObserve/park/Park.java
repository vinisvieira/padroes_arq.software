package viniciusLindembergObserve.park;

import viniciusLindembergObserver.concreteObserver.John;
import viniciusLindembergObserver.concreteObserver.Kevin;
import viniciusLindembergObserver.concreteObserver.Oscar;
import viniciusLindembergObserver.concreteSubject.MyMasterOrder;
import viniciusLindembergObserver.observer.Kids;
import viniciusLindembergObserver.subject.Master;

public class Park {
	
	public void start(){
		
		Master master = new MyMasterOrder();
		
		Kids john = new John(master);
		Kids kevin = new Kevin(master);
		Kids oscar = new Oscar(master);
		
		master.myMasterOrder();
		master.myMasterOrder();
		master.myMasterOrder();
		master.myMasterOrder();
		master.myMasterOrder();
		
	}

}
