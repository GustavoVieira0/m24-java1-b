package br.com.senaisp.bauru.gustavo.licao06;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] valores;
		System.out.println("Digite o número de elementos que você deseja: ");
		int qtdade = sc.nextInt();
		valores = new int[qtdade];
		//laço de repetição para solicitar os números
		for (int i=0;i<valores.length;i++) {
			System.out.println("Digite o elemento " + (i+1) + ":");
			valores[i] = sc.nextInt();
		}
		//Qual seria o maior valor digitado?
		//Qual a média dos valores?
		//Qual seria a soma dos valores?
		int maior=Integer.MIN_VALUE,soma=0;
		for(int el : valores) {
			soma += el;//soma = soma + el
			if(el>maior) {
				maior = el;
			}
		}
		//Mostrando os valores
		System.out.println("Maior valor: " +  maior);
		System.out.println("Média: " + (soma * 1.0 / valores.length));
		System.out.println("Soma: " + soma);
		sc.close();
	}

}
