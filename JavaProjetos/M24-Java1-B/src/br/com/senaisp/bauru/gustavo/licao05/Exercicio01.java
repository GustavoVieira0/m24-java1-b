package br.com.senaisp.bauru.gustavo.licao05;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o operador 1: ");
		int vlr1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite a operação: ");
		String operacao = sc.nextLine();
		System.out.println("Digite o operador 2: ");
		int vlr2 = sc.nextInt();
		//Verifcando as operações
		int valor = 0;
		switch(operacao) {
		case "+" : valor = vlr1 + vlr2 break;
		case "-" : valor = vlr1 - vlr2 break;
		case "/" : valor = vlr1 / vlr2 break;
		case "*" : valor = vlr1 * vlr2 break;
		default: System.out.println("Operação Inválida!");
		}
		System.out.println("Resultado: " +valor);
		sc.close();
	}
}
