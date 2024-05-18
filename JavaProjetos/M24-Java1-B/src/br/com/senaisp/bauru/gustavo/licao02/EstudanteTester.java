package br.com.senaisp.bauru.gustavo.licao02;

public class EstudanteTester {

	public static void main(String[] args) {
		//Criando um Estudante
		Estudante est01 = new Estudante();
		//Atribuindo valores nos campos
		est01.setNome("Gustavo");
		est01.setId(1);
		est01.setMedia(5.5f);
		//Mostrando valores
		System.out.println("Nome: " + est01.getNome());
		System.out.println("Documento: "  + est01.getDocumento());
		//Obtendo o objeto como representante textual
		System.out.println(est01.toString());
		//Criando um novo Estudante
		Estudante est02 = new Estudante(2, "Lauren", "123456789", 9.6f, 1600.00, true);
		//Mostrando o estudante
		System.out.println(est02.toString());
	}

}
