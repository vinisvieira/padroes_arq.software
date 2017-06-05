package vinicius.lindemberg.composite.composite;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<Refrigerante> {
	private Stack<Iterator<Refrigerante>> pilha;

	public CompositeIterator(Iterator<Refrigerante> iterator) {
		pilha = new Stack<>();
		pilha.push(iterator);

	}

	@Override
	public boolean hasNext() {
		if (pilha.isEmpty()) {
			return false;
		} else {
			Iterator<Refrigerante> i = pilha.peek();
			if (i.hasNext()) {
				return true;
			} else {
				pilha.pop();
				hasNext();
			}

		}

		return false;
	}

	@Override
	public Refrigerante next() {
		if (hasNext()) {
			Iterator<Refrigerante> i = pilha.peek();
			Refrigerante rf = i.next();
			if (rf instanceof PaleteDeRefri || rf instanceof GradeDeRefri) {
				pilha.push(rf.createIterator());
			}
			return rf;

		} else {
			return null;
		}
	}
}