package br.com.senaisp.bauru.gustavo.licao05;

import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome completo: ");
		String nome = sc.nextLine();
		//Utilizando Scanner para separar os nomes
		Scanner scA = new Scanner(nome);//passando a entrada para nome
		String primeiroNome="", ultimoNome="";
		//Utilizando o laço while
		while(scA.hasNext()) {
			ultimoNome = scA.next();
			if(primeiroNome.equals("")) {
				primeiroNome = ultimoNome;
			}
		}
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Ultimo nome: " + ultimoNome);
		scA.close();
		sc.close();
	}

}
