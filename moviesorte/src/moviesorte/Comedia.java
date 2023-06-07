package moviesorte;

public class Comedia extends Serie{
	
	private String emmy;

	public Comedia(String nome, String genero, String[] atores, double imdb, String sinopse, int ano, String emmy ) {
		
		super(nome, genero, atores, imdb, sinopse, ano);
		this.emmy = emmy;
		
	}
	public String getInsicacao() {
		return emmy;
	}

	public void setIndicacao(String emmy) {
		this.emmy = emmy;
	}
}

