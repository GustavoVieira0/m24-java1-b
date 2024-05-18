package br.com.senaisp.bauru.gustavo.licao01;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);//useLocale(locale.US)
		double galoes = 15;
		double litros = 0;
		double gal2lt = 3.785;
		//solicitar a entrada via teclado pelo usuário
		System.out.println("Digite a quantidade de galões a serem convertidos");
		galoes = scn.nextDouble();
		scn.close();
		//Fazendo as contas
		litros = galoes * gal2lt;
		//mostrar resultado
		System.out.println(galoes + " galões equivalem a " +
							litros + " litros");
	}

}
