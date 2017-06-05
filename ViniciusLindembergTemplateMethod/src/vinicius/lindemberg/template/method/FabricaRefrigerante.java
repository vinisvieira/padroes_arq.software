package vinicius.lindemberg.template.method;

import java.util.Random;

public abstract class FabricaRefrigerante {

	public double producao(int quant) {
		double custo = 0;

		custo += this.producaoGarrafa(quant);
		custo += this.producaoTampa(quant);
		custo += this.producaoArteEmbalagem(quant);
		custo += this.producaoRefrigerante(quant);
		custo += this.empacotamento(quant);

		if (this.condicao()) {

			Random rd = new Random();

			custo -= this.contaminacaoDosProdutos(rd.nextInt(quant)+1);

		}

		return custo;
	}

	public abstract double producaoGarrafa(int quant);

	public abstract double producaoTampa(int quant);

	public abstract double producaoArteEmbalagem(int quant);

	public abstract double producaoRefrigerante(int quant);

	public abstract double empacotamento(int quant);

	public boolean condicao() {

		return false;
	}

	public double contaminacaoDosProdutos(int quant) {

		return this.producaoGarrafa(quant) + this.producaoTampa(quant) + this.producaoArteEmbalagem(quant) +
				this.producaoRefrigerante(quant) + empacotamento(quant);

	}

}