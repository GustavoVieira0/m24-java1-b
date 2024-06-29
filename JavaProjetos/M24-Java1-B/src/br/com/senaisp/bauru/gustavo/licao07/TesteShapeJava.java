package br.com.senaisp.bauru.gustavo.licao07;

public class TesteShapeJava {

	public static void main(String[] args) {
		ShapeJava sp = new ShapeJava(15, 15);
		sp.largura = 10; //Não acesssível por conta do private
		ShapeJava sp2 = ShapeJava.getInstancia(16, 16);
		sp2.altura = 16;
		
	}

}
