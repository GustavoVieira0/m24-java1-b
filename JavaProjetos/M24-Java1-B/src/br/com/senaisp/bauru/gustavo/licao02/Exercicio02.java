package br.com.senaisp.bauru.gustavo.licao02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String nome;
		//Mostrando a mensagem oara o usuário
		System.out.println("Digite seu nome completo:");
		nome = scn.nextLine();
		//Vamos separar nome de sobrenome
		String primNome = nome.substring(0,(nome+" ").indexOf(" "));
		String lastName = nome.substring(nome.lastIndexOf(" ")+1);
		
		System.out.println(primNome);
		System.out.println(lastName);
		//fechando Scanner
		scn.close();
	}

}
