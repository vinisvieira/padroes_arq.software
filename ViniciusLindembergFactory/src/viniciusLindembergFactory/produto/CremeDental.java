package viniciusLindembergFactory.produto;

import viniciusLindembergFactory.componentes.ComponenteEmbalagem;
import viniciusLindembergFactory.componentes.ComponenteInterno;

public abstract class CremeDental {

	public String name;
	public String fabrica;
	public double preco;
	public ComponenteEmbalagem componenteEmbalagem;
	public ComponenteInterno componenteInterno;

	public abstract void createCremeDental();

	public void calculoValor(double price) {
		venda();
	}

	public abstract void venda();

}