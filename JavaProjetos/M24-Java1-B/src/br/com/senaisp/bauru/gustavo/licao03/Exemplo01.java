package br.com.senaisp.bauru.gustavo.licao03;

public class Exemplo01 {

	public static int _idade = 18;
	public static void main(String[] args) {
		byte vByte = 127;
		vByte++;//aqui ocorre o estouro do limite do byte
		System.out.println(vByte);//monstra o limite inferior
		float vFloat = 6_000.00f;
		if(vByte == -128) {
			String nome = "Gustavo";
			System.out.println("Meu nome é " + nome);
		}
		//aqui não existe a variavel nome
		//System.out.println(nome);
		_idade = 20;
		System.out.println(_idade);
		int idade = 50;
		System.out.println(idade);
		idade += 20; //Soma 20 à idade
		System.out.println(idade);
	}

}
