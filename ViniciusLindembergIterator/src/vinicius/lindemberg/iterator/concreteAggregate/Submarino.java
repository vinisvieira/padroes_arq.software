package vinicius.lindemberg.iterator.concreteAggregate;

import java.util.HashMap;
import java.util.Map;

import vinicius.lindemberg.iterator.FuncionarioCorreios;
import vinicius.lindemberg.iterator.aggregate.FuncionarioEmpresa;
import vinicius.lindemberg.iterator.concreteIterator.EntregadorSubmarino;
import vinicius.lindemberg.iterator.entity.Produto;

public class Submarino implements FuncionarioEmpresa {

	private Map<Integer, Produto> produtos;

	public Submarino() {

		produtos = new HashMap<>();
		produtos.put(0, new Produto("SmartTV Samsung 42", 2500f, 80f));
		produtos.put(1, new Produto("Livro Game of Thrones ", 89f, 22f));
		produtos.put(2, new Produto("Blu Ray Game of Thrones", 125f, 36f));
		produtos.put(3, new Produto("Iphone 6S", 3500f, 44f));
		produtos.put(4, new Produto("PS3", 1200f, 33f));
	}

	@Override
	public FuncionarioCorreios receberprodutos() {

		return new EntregadorSubmarino(produtos);
	}

}
