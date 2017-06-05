package vinicius.lindemberg.iterator.main;

import java.util.ArrayList;

import vinicius.lindemberg.iterator.FuncionarioCorreios;
import vinicius.lindemberg.iterator.aggregate.FuncionarioEmpresa;
import vinicius.lindemberg.iterator.concreteAggregate.Americanas;
import vinicius.lindemberg.iterator.concreteAggregate.Netshoes;
import vinicius.lindemberg.iterator.concreteAggregate.Submarino;

public class Correios {

	public ArrayList<FuncionarioEmpresa> empresas = new ArrayList<>();

	public Correios() {

		empresas.add(new Netshoes());
		empresas.add(new Americanas());
		empresas.add(new Submarino());

		for (FuncionarioEmpresa funcionarioEmpresa : empresas) {

			FuncionarioCorreios funcionario = funcionarioEmpresa.receberprodutos();
			organizarEntregas(funcionario);

		}
	}

	public void organizarEntregas(FuncionarioCorreios funcionario) {
		while (funcionario.faltaProduto()) {
			System.out.println(funcionario.organizar());
		}
	}
}
