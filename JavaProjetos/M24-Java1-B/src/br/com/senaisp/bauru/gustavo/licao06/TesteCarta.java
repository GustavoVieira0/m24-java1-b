package br.com.senaisp.bauru.gustavo.licao06;

public class TesteCarta {

	public static void main(String[] args) {
		Carta ct;
		try {
			ct= new Carta(4, 10s);
			System.out.println();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
