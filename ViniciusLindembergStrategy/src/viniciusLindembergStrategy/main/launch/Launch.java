package viniciusLindembergStrategy.main.launch;

import viniciusLindembergStrategy.competicao.Competicao;

public class Launch {
	
/*	No Meu Padr�o Strategy, eu Resolvi fazer uma competi��o entre 3 dos maiores arqueiros do cinema/desenho mundial,
 *  Gavi�o Arqueiro do filme Os Vingadores, Hank do desenho A Caverna Do Drag�o e Katniss Everdeen do filme Jogos Vorazes.
 *  Nessa competi��o os 3 arqueiros v�o se enfrentar, e v�o ter 3 rounds para somar mais pontos acertando o alvo,
 *  a pontua��o vai de 0 a 200 por round, sendo 0 fora do alvo e 100 o centro do alvo */

/* Strategy */
/* Flecha que � qual tipo de flecha sera usado e Tiro que � qual tipo de tiro sera usado */	
	
/* Concrete Strategy */
/* Flecha Eletrica que � dominada melhor por Hank , Flecha Magnetica essa flecha da 0% ou 100% de acerto aos 3,
 * TiroDuplo garante pelo menos 1 tiro no alvo, TiroPerfurante pode ir de 0 a 100 pontos */

/* Context */
/* Class abstrata Arqueiro */
	
	public static void main(String[] args) {
		
		Competicao competicao = new Competicao();
		competicao.start();

	}

}
