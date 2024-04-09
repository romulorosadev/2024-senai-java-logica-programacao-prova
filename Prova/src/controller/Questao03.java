package controller;

import util.Teclado;

public class Questao03 {
	public static void main(String[] args) {
		System.out.println("POSSO VOTAR?");
		System.out.println("------------");
		int inIdade;
		String outMensagem;
		
		do {
			inIdade = Teclado.lerInt("\nINFORME SUA IDADE: ");
			
			if(inIdade > 00 && inIdade < 16) {
				outMensagem = inIdade + " ANOS: Voto Proibido.";
			}
			else if (inIdade >= 18 && inIdade <= 69) {
				outMensagem = inIdade + " ANOS: Voto Obrigatório.";
			}
			else if (inIdade == 16 || inIdade == 17 || inIdade >= 70){
				outMensagem = inIdade + " ANOS: Voto Facultativo.";
			}
			else {
				outMensagem = inIdade + ": IDADE INVÁLIDA. Encerrando o programa";
			}
			
			System.out.println(outMensagem);
			System.out.println("----------------------------\n");	
		}
		while(inIdade > 0);
	}
}