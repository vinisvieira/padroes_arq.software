package vinicius.lindemberg.iterator.concreteAggregate;

import vinicius.lindemberg.iterator.FuncionarioCorreios;
import vinicius.lindemberg.iterator.aggregate.FuncionarioEmpresa;
import vinicius.lindemberg.iterator.concreteIterator.EntregadorNetshoes;
import vinicius.lindemberg.iterator.entity.Produto;

public class Netshoes implements FuncionarioEmpresa {

	private Produto[] produtos;

	public Netshoes() {

		produtos = new Produto[5];
		produtos[0] = new Produto("Tenis Adidas", 200f, 18f);
		produtos[1] = new Produto("Tenis Nike", 250f, 18f);
		produtos[2] = new Produto("Camisa Palmeiras", 180f, 18f);
		produtos[3] = new Produto("Tenis Reebok", 140f, 18f);
		produtos[4] = new Produto("Chuteira Nike", 350f, 18f);

	}

	@Override
	public FuncionarioCorreios receberprodutos() {

		return new EntregadorNetshoes(produtos);
	}

}
