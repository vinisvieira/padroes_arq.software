package vinicius.lindemberg.composite.composite;

import java.util.Iterator;

public abstract class Refrigerante {

	public void criarRefri(Refrigerante refrigerante) {
		throw new UnsupportedOperationException();
	}

	public void tirarRefriDeLinha(Refrigerante refrigerante) {
		throw new UnsupportedOperationException();
	}

	public String verificarValidade(int refrigerante) {
		throw new UnsupportedOperationException();
	}

	public void refrigerantes() {
		throw new UnsupportedOperationException();
	}

	public String getDataValidade() {
		throw new UnsupportedOperationException();
	}

	public Iterator<Refrigerante> createIterator() {
		return new NullIterator();
	}

	public boolean isValid() {
		throw new UnsupportedOperationException();
	}
}