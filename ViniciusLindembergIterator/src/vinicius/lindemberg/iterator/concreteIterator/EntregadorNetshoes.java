package vinicius.lindemberg.iterator.concreteIterator;

import vinicius.lindemberg.iterator.FuncionarioCorreios;
import vinicius.lindemberg.iterator.entity.Produto;

public class EntregadorNetshoes implements FuncionarioCorreios {

	Produto[] produtos;
	private int contador = 0;

	public EntregadorNetshoes(Produto[] produtos) {

		this.produtos = produtos;
	}

	@Override
	public boolean faltaProduto() {
		if (contador == produtos.length)
			return false;
		return true;

	}

	@Override
	public Produto organizar() {

		Produto entregas = produtos[contador];
		contador++;
		return entregas;
	}

}
