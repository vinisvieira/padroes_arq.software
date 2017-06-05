package vinicius.lindemberg.composite.composite;

import java.util.Iterator;

public class NullIterator implements Iterator<Refrigerante> {

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public Refrigerante next() {
		return null;
	}

}
