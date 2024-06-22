package br.com.senaisp.bauru.gustavo.licao07;

public class TesteZoo {

	public static void main(String[] args) {
		Mamifero mam = new Cachorro();
		mam.setCor("Caramelo");
		mam.setNome("Totó");
		mam.setIdade(3);
		//Testa se o mam é um cachorro
		if(mam instanceof Cachorro) {
			((Cachorro) mam).setQuadrupede(true);
		}
		mam.falar();
		System.out.println(mam.toString());
	}

}
