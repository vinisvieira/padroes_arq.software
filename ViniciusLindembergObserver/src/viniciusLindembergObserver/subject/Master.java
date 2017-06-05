package viniciusLindembergObserver.subject;

import viniciusLindembergObserver.observer.Kids;

public interface Master {

	public void getInPlay(Kids kid);
	public void getOutPlay(Kids kid);
	public void myMasterOrder();
	
}
