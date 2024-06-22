package br.com.senaisp.bauru.gustavo.licao07;

public class Gato extends Mamifero {
	//Fields
	private boolean quadrupede;
	
	//Getters e Setters
	public boolean isQuadrupede() {
		return quadrupede;
	}

	public void setQuadrupede(boolean quadrupede) {
		this.quadrupede = quadrupede;
	}
	//Métodos
	@Override
	public void falar() {
		System.out.println("Miau Miau Miau");
	}
}
