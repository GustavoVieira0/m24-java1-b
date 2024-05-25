package br.com.senaisp.bauru.gustavo.licao03;

public class Exemplo2 {

	public static void main(String[] args) {
		int a = 10;
		int b = a++;
		int c = ++a;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		//nesse ponto a = 13
		double total = (double) ++a / 2;
		System.out.println(total);
		char letraA = 'A';
		char letraB = 'B';
		System.out.println(++letraA);
		System.out.println(""+letraA + letraB);
	}

}
