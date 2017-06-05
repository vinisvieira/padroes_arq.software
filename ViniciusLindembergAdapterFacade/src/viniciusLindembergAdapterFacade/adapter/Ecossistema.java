package viniciusLindembergAdapterFacade.adapter;

import viniciusLindembergAdapterFacade.facade.Barulho;
import viniciusLindembergAdapterFacade.interfaces.PigmentacaoCamaleaoEmPerigo;
import viniciusLindembergAdapterFacade.interfaces.PigmentacaoCamaleaoNormal;
import viniciusLindembergAdapterFacade.interfaces.PigmentacaoIguanaEmPerigo;
import viniciusLindembergAdapterFacade.interfaces.PigmentacaoIguanaNormal;
import viniciusLindembergAdapterFacade.model.CamaleaoEmPerigo;
import viniciusLindembergAdapterFacade.model.CamaleaoNormal;
import viniciusLindembergAdapterFacade.model.IguanaEmPerigo;
import viniciusLindembergAdapterFacade.model.IguanaNormal;

public class Ecossistema {

	public void florestaAmazonica() {

		System.out.println("A Iguana e o Camaleão estavam tranquila pela floresta...");
		System.out.println(" ");

		PigmentacaoCamaleaoNormal camaleaoNormal = new CamaleaoNormal();
		PigmentacaoIguanaNormal iguanaNormal = new IguanaNormal();

		camaleaoNormal.tranquiloNaFloresta();
		camaleaoNormal.pigmentacaoPadrao();
		
		System.out.println("");
		
		iguanaNormal.tranquiloNaFloresta();
		iguanaNormal.pigmentacaoPadrao();

		System.out.println("");
		System.out.println("Até aparecer uma serpente... e nem a Iguana nem o Camaleao perceberam...");
		System.out.println("");
		System.out.println("Mas ai o Macaco avista a situação e avisar a eles");
		System.out.println("");
		
		Barulho barulho = new Barulho();
		
		barulho.grito();
		
		System.out.println("");

		PigmentacaoCamaleaoEmPerigo camaleaoEmPerigo = new CamaleaoEmPerigo();
		PigmentacaoIguanaEmPerigo iguanaEmPerigo = new IguanaEmPerigo();

		camaleaoEmPerigo.correr();
		camaleaoEmPerigo.pigmentacaoDePerigo();
		
		System.out.println("");

		iguanaEmPerigo.correr();
		iguanaEmPerigo.pigmentacaoDePerigo();

		System.out.println("");
		System.out.println("após consegui despistar a serpente, eles voltam as suas atividades normal...");
		System.out.println("");


		barulho.acao();

	}

}