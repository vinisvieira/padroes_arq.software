package vinicius.lindemberg.iterator.concreteIterator;

import java.util.ArrayList;
import java.util.List;

import vinicius.lindemberg.iterator.FuncionarioCorreios;
import vinicius.lindemberg.iterator.entity.Produto;

public class EntregadorAmericanas implements FuncionarioCorreios {

	private List<Produto> produtos = new ArrayList<Produto>();
	private int contador = 0;

	public EntregadorAmericanas(List<Produto> produtos) {

		this.produtos = produtos;

	}

	@Override
	public boolean faltaProduto() {
		if (contador == produtos.size())
			return false;
		return true;
	}

	@Override
	public Produto organizar() {

		return produtos.get(contador++);

	}
}