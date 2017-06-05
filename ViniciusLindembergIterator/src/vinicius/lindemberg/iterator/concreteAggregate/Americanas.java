package vinicius.lindemberg.iterator.concreteAggregate;

import java.util.ArrayList;
import java.util.List;

import vinicius.lindemberg.iterator.FuncionarioCorreios;
import vinicius.lindemberg.iterator.aggregate.FuncionarioEmpresa;
import vinicius.lindemberg.iterator.concreteIterator.EntregadorAmericanas;
import vinicius.lindemberg.iterator.entity.Produto;

public class Americanas implements FuncionarioEmpresa {

	private List<Produto> produtos;

	public Americanas() {
		
		produtos = new ArrayList<>();
		produtos.add(new Produto("PS4", 2000f, 42f));
		produtos.add(new Produto("Xbox One", 1500f, 42f));
		produtos.add(new Produto("TV LG 32", 1200f, 65f));
		produtos.add(new Produto("SmartPhone LG K10", 700f, 33f));
		produtos.add(new Produto("Blu Ray Batman", 60f, 25f));
	}

	@Override
	public FuncionarioCorreios receberprodutos() {

		return new EntregadorAmericanas(produtos);
	}

}
