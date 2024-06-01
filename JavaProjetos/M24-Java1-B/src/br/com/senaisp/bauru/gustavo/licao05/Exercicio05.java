package br.com.senaisp.bauru.gustavo.licao05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		System.out.println((idade > 17 ? "Você é maior de idade" : "Você é menor de idade"));
		sc.close();
	}

}
