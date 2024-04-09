package controller;

import util.Teclado;

public class Questao02 {
	public static void main(String[] args) {
		
		System.out.println("SENSO DE GAMES");
		
		int iLimite = 3;
		
		int outSomaNoGamer = 0;
		int outSomaMobile = 0;
		int outSomaVideoGame = 0;
		int outSomaPC = 0;
		int outSomaGamerInvalidos = 0;
		int outSomaPlataformaInvalidos = 0;
		
		for(int i = 0; i < iLimite; i++) {
			System.out.println("----------------------------------");
			System.out.println("\nJOGA ALGUM JOGO ELETRÔNICO?\n");
			System.out.println("1: Sim");
			System.out.println("2: Não");
			int inGamer = Teclado.lerInt("\nINFORME A OPÇÃO CORRESPONDENTE:");
			
			
			if(inGamer == 1) {
				System.out.println("\nPRINCIPAIS PLATAFORMAS");
				System.out.println("1: Mobile");
				System.out.println("2: Video");
				System.out.println("3: PC");
				System.out.println("----------------------------------\n");
				
				int inPlataforma = Teclado.lerInt("Informe o número de sua opção correspondente: ");
				
				switch(inPlataforma) {
				case 1:
					outSomaMobile++;
					break;
				case 2:
					outSomaVideoGame++;
					break;
				case 3:
					outSomaPC++;
					break;
				default:
					outSomaPlataformaInvalidos++;
				}
			}
			else if(inGamer == 2){
				outSomaNoGamer++;
			}
			else {
				outSomaGamerInvalidos++;
			}
			
			System.out.println("");
		}
		
		System.out.println("\n----------------------------------");
		System.out.println("RESULTADO SENSO GAMES");
		System.out.println("----------------------------------\n");
	
		System.out.println("JOGAM COM MOBILE: " + outSomaMobile);
		System.out.println("JOGAM COM VIDEO-GAME: " + outSomaVideoGame);
		System.out.println("JOGAM COM PC: " + outSomaPC + "\n");
		
		if(outSomaPlataformaInvalidos > 0) {
			System.out.println("JOGAM COM NENHUMA DAS OPÇÕES ACIMA: " + outSomaPlataformaInvalidos + "\n");
		}
		
		if(outSomaNoGamer > 0) {
			System.out.println("NÃO JOGAM: " + outSomaNoGamer + "\n");
		}
		
		if(outSomaGamerInvalidos > 0) {
			System.out.println("NÃO RESPONDERAM: " + outSomaGamerInvalidos);
		}
	}
}
