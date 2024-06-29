package br.com.senaisp.bauru.gustavo.licao07;

public class TesteMultiplosArgumentos {

	public static void main(String[] args) {
		System.out.println("Soma de 2 valores: " + calcularSoma(10,20));
		System.out.println("Soma de 4 valores: " + calcularSoma(10,20,30,40));
	}
	//Método que soma valores
	public static int calcularSoma(int ... itens) {
		int ret = 0;
		for(int vl : itens) {
			ret += vl;
		}
		return ret;
	}
}
