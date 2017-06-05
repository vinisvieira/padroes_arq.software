package viniciusLindembergAdapterFacade.facade;

import viniciusLindembergAdapterFacade.interfaces.MacacoBarulhento;
import viniciusLindembergAdapterFacade.model.CamaleaoNormal;
import viniciusLindembergAdapterFacade.model.IguanaNormal;
import viniciusLindembergAdapterFacade.model.Macaco;

public class Barulho {
	
	MacacoBarulhento macacoBarulhento;
	CamaleaoNormal camaleaoNormal;
	IguanaNormal iguanaNormal;
	
	public Barulho() {
		
		macacoBarulhento = new Macaco();
		camaleaoNormal = new CamaleaoNormal();
		iguanaNormal = new IguanaNormal();
		
	}
	
	public void acao(){
		
		camaleaoNormal.voltaAoNormal();
		iguanaNormal.voltaAoNormal();
		
	}
	
	public void grito(){
		
		macacoBarulhento.gritar();
		
	}

}