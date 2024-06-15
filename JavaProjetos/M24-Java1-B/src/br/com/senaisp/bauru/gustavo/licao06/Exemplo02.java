package br.com.senaisp.bauru.gustavo.licao06;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] cinema = new String[10][10];
		//Inicializando o cinema
		for(int i=0;i<cinema.length;i++) {
			for (int j=0;j<cinema[i].length;j++) {
				cinema[i][j] = "-";
			}
		}
		//Comprando os ingressos
		String term;
		mostrarPoltronas(cinema);
		do {
			System.out.println("Qual fileira você deseja?");
			int fl = sc.nextInt();
			System.out.println("Qual a poltrona você deseja?");
			int po = sc.nextInt();
			//Verificando se está disponivel
			try {
				if(cinema[fl -1][po -1].equals("-")) {
					cinema[fl -1][po -1] = "X";
				}else {
					System.out.println("Não está disponível!");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Valor digitado é inválido!");
			}
			mostrarPoltronas(cinema);
			System.out.println("Deseja continuar(S/N)?:");
			sc.nextLine();
			term = sc.nextLine();
		} while(!term.equalsIgnoreCase("N"));
		sc.close();
	}

	private static void mostrarPoltronas(String[][] cinema) {
		for(int i=0;i<cinema.length;i++) {
			System.out.println("FL " + (i<9 ? " " : "") + (i+1) + " ");
			for (int j=0;j<cinema[i].length;j++) {
				System.out.print(cinema[i][j] + " ");
			}
			System.out.println();
		}
	}

}
