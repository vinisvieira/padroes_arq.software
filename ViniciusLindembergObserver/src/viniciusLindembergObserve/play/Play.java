package viniciusLindembergObserve.play;

public class Play {

	private String fazerOque;

	public Play(String fazerOQue) {
		super();
		this.fazerOque = fazerOQue;

	}

	public String getFazerOque() {
		return fazerOque;
	}

	public void setFazerOque(String fazerOque) {
		this.fazerOque = fazerOque;
	}

	@Override
	public String toString() {
		return "Play [fazerOque=" + fazerOque + "]";
	}
}