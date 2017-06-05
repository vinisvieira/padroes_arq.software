package vinicius.lindemberg.composite.composite;

import java.util.Iterator;

public class FuncionarioFabrica {

	public void formaDeProducao(Refrigerante distribuição) {
		System.out.println("Linha de Distribuição de refrigerante");
		distribuição.refrigerantes();
	}

	public void produtosValidos(Refrigerante validos) {
		Iterator<Refrigerante> iRefri = validos.createIterator();
		int total = 0;

		while (iRefri.hasNext()) {
			Refrigerante r = iRefri.next();
			try {
				if (r.isValid()) {
					total++;
				}
			} catch (UnsupportedOperationException e) {

			}
		}
		System.out.println(" Total de Refrigerante com Validade: " + total);
	}

}
