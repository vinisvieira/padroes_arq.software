package vinicius.lindemberg.iterator.main;

/*meu tema eu tenho as empresas Submarino, Americanas e Netshoes
 * que enviam seus produtos vendidos para o correios e ele organizam as entregas
 * 
 * quem são os ConcreteAgregate?
 * Americanas,Submarino e Netshoes
 * 
 * quem é o iterator?
 * FuncionarioCorreios
 * 
 * */

public class Launch {

	public static void main(String[] args) {
		
		System.out.println("------------ENTREGAS---------");
		
		new Correios();
		
		System.out.println("------------ENTREGAS---------");


	}

}
