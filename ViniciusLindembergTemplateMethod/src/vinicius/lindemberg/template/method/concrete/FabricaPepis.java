package vinicius.lindemberg.template.method.concrete;

import vinicius.lindemberg.template.method.FabricaRefrigerante;

public class FabricaPepis extends FabricaRefrigerante {

	@Override
	public double producaoGarrafa(int quant) {

		return (0.20 * quant);
	}

	@Override
	public double producaoTampa(int quant) {

		return (0.10 * quant);
	}

	@Override
	public double producaoArteEmbalagem(int quant) {

		return (0.25 * quant);
	}

	@Override
	public double producaoRefrigerante(int quant) {

		return (2.00 * quant);
	}

	@Override
	public double empacotamento(int quant) {

		return (1.00 * quant);
	}
	
	
}