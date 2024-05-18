package br.com.senaisp.bauru.gustavo.licao02;

public class Estudante {
	//Campos ou Fields ou Variáveis de instância
	private int id;
	private String nome;
	private String documento;
	private float media;
	private boolean fumante;
	private double bolsaEstudo;
	
	//Constructors
	//Constructor padrão sem parametros
	public Estudante(){
		id = 0;
		nome = "Sem nome";
		documento = "Sem documento";
		media = 0.0f;
		fumante = false;
		bolsaEstudo = 0.0;
	}
	public Estudante(int id, String nome, String documento, float media, double bolsa, boolean fum) {
		setId(id);
		setNome(nome);
		setDocumento(documento);
		setMedia(media);
		setBolsaEstudo(bolsa);
		setFumante(fum);
		
	}
	
	//Getters e Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.length()<2) {
			throw new RuntimeException("Nome tem que ter pelo menos 2 caracteres");
		}
		this.nome = nome;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}

	public boolean isFumante() {
		return fumante;
	}

	public void setFumante(boolean fumante) {
		this.fumante = fumante;
	}

	public double getBolsaEstudo() {
		return bolsaEstudo;
	}

	public void setBolsaEstudo(double bolsaEstudo) {
		this.bolsaEstudo = bolsaEstudo;
	}
	
	//Methods
	@Override
	public String toString() {
		return 	"Id: " + getId() + "\n" +
				"Nome: " + getNome() + "\n"+
				"Documento: " + getDocumento() + "\n" +
				"Média: " + getMedia() + "\n" +
				"Bolsa de Estudo: " + getBolsaEstudo() + "\n" +
				"Fumante :" + isFumante();
				
		
	}
}

