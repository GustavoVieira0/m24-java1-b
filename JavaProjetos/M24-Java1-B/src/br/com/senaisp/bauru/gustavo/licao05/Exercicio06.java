package br.com.senaisp.bauru.gustavo.licao05;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Forca fo = new Forca();
		fo.monstrarForca();
		String palavra = "";
		while(!fo.isTerminado()) {
			System.out.println("Digite uma letra: ");
			palavra = sc.nextLine();
			if(!fo.verificaLetra(palavra.charAt(0))) {
				System.out.println("Letra não encontrada!");
			}
			fo.monstrarForca();
		}
		sc.close();
		System.out.println("A palavra secreta era: " + fo.mostrarPalavra());
	}

}
