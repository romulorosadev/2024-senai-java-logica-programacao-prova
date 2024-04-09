package controller;

import util.Teclado;

public class Questao01 {
	
	public static void main(String[] args) {
		System.out.println("ALUGUEL DE VEÍCULO");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("CATEGORIA"+ "\t" + "TIPO"+ "\t\t\t\t" + "VALOR DIÁRIA");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("1"+ "\t\t" + "Popular"+ "\t\t\t\t" + "R$ 299,99");
		System.out.println("2"+ "\t\t" + "Hatch ou Sedan Intermediário"+ "\t" + "R$ 399,99");
		System.out.println("3"+ "\t\t" + "SUV ou Sedan Luxo" + "\t\t" + "R$ 499,99");
		System.out.println("-----------------------------------------------------------------\n");
		System.out.println("INFORME OS SEGUINTES DADOS, CONFORME SOLICITADO:\n");
		int 	inCategoria 	= Teclado.lerInt("Número da categoria de veículo desejado: \n");
		int 	inDiariaQuant 	= Teclado.lerInt("Quantidade de diárias: ");
		
		String 	inTipo;
		String 	outMensagem;

		boolean condCat0  		= inCategoria < 1 || inCategoria > 3;
		boolean condDias0 		= inDiariaQuant < 1 || inDiariaQuant > 30;
		boolean condCatDias 	= condCat0 || condDias0;
		double 	inDiariaVal;
		double 	inDiariaDesc;
		
		if(condCatDias) {
			if(condCat0 && condDias0) {
				outMensagem = "CATEGORIA: " + "\t" + "Informe um valor entre 1 e 3.\nDIÁRIAS: " + "\t" + "Informe um valor entre 1 e 30.";
			}
			else {
				outMensagem = "CATEGORIA: Informe um valor entre 1 e 3.";
				
				if(condDias0) {
					outMensagem = "DIÁRIAS: Informe um valor entre 1 e 30.";
				}
			}
			System.out.println("\n-----------------------------------------------------------------");
			System.out.println("OPERAÇÃO INVÁLIDA\n" + outMensagem);
		} 
		else {
			
			if (inCategoria == 1) {
				inTipo = "Popular";
				inDiariaVal = 299.99;
			}
			else if (inCategoria == 2) {
				inTipo = "Hatch ou Sedan Intermediário";
				inDiariaVal = 399.99;
			}
			else {
				inTipo = "SUV ou Sedan Luxo";
				inDiariaVal = 499.99;
			}
				
			
			if (inDiariaQuant <= 6) {
				inDiariaDesc = 0.0;
			}
			else if (inDiariaQuant >= 7 && inDiariaQuant <= 14) {
				inDiariaDesc = 0.95;	
			}
			else {
				inDiariaDesc = 0.9;
			}
			
			System.out.println("-----------------------------------------------------------------");
			System.out.println("CATEGORIA: " + inCategoria);
			System.out.println("TIPO: " + inTipo);
			System.out.println("DIÁRIA(S): " + inDiariaQuant);
			System.out.println("VALOR DIÁRIA(S): R$" + inDiariaVal);
			System.out.println("VALOR BRUTO: R$" + (inDiariaVal * inDiariaQuant));
			System.out.println("VALOR ALUGUEL: R$" + ((inDiariaVal * inDiariaQuant) * inDiariaDesc));
			System.out.println("-----------------------------------------------------------------");
		}
	}
}