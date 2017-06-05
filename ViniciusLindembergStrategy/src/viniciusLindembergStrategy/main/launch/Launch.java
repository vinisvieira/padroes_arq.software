package viniciusLindembergStrategy.main.launch;

import viniciusLindembergStrategy.competicao.Competicao;

public class Launch {
	
/*	No Meu Padrão Strategy, eu Resolvi fazer uma competição entre 3 dos maiores arqueiros do cinema/desenho mundial,
 *  Gavião Arqueiro do filme Os Vingadores, Hank do desenho A Caverna Do Dragão e Katniss Everdeen do filme Jogos Vorazes.
 *  Nessa competição os 3 arqueiros vão se enfrentar, e vão ter 3 rounds para somar mais pontos acertando o alvo,
 *  a pontuação vai de 0 a 200 por round, sendo 0 fora do alvo e 100 o centro do alvo */

/* Strategy */
/* Flecha que é qual tipo de flecha sera usado e Tiro que é qual tipo de tiro sera usado */	
	
/* Concrete Strategy */
/* Flecha Eletrica que é dominada melhor por Hank , Flecha Magnetica essa flecha da 0% ou 100% de acerto aos 3,
 * TiroDuplo garante pelo menos 1 tiro no alvo, TiroPerfurante pode ir de 0 a 100 pontos */

/* Context */
/* Class abstrata Arqueiro */
	
	public static void main(String[] args) {
		
		Competicao competicao = new Competicao();
		competicao.start();

	}

}
