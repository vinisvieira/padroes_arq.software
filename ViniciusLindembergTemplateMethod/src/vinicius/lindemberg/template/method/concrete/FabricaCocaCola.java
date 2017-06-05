package vinicius.lindemberg.template.method.concrete;

import vinicius.lindemberg.template.method.FabricaRefrigerante;

public class FabricaCocaCola extends FabricaRefrigerante {

	private int index = 0;

	@Override
	public double producaoGarrafa(int quant) {

		return (0.30 * quant);
	}

	@Override
	public double producaoTampa(int quant) {

		return (0.10 * quant);
	}

	@Override
	public double producaoArteEmbalagem(int quant) {

		return (0.50 * quant);
	}

	@Override
	public double producaoRefrigerante(int quant) {

		return (2.50 * quant);
	}

	@Override
	public double empacotamento(int quant) {

		return (1.10 * quant);
	}

	public boolean condicao() {
		
		if(index == 0){
			
			index++;
			return true;
		}else 

			return false;
	}

}