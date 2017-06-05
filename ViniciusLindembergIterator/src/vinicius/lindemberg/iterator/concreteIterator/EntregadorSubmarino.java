package vinicius.lindemberg.iterator.concreteIterator;

import java.util.HashMap;
import java.util.Map;

import vinicius.lindemberg.iterator.FuncionarioCorreios;
import vinicius.lindemberg.iterator.entity.Produto;

public class EntregadorSubmarino implements FuncionarioCorreios {

	private Map<Integer, Produto> produtos = new HashMap<>();
	private int contador = 0;

	public EntregadorSubmarino(Map<Integer, Produto> produtos) {

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