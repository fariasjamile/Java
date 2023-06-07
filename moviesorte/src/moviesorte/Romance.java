package moviesorte;

public class Romance extends Serie{
	
	private String CriticsChoiceTelevisionAward;

	public Romance(String nome, String genero, String[] atores, double imdb, String sinopse, int ano, String CriticsChoiceTelevisionAward) {
		
		super(nome, genero, atores, imdb, sinopse, ano);
		this.CriticsChoiceTelevisionAward = CriticsChoiceTelevisionAward;
		
	}
	public String getCriticsChoiceTelevisionAward() {
		return CriticsChoiceTelevisionAward;
	}

	public void setCriticsChoiceTelevisionAward(String CriticsChoiceTelevisionAward) {
		this.CriticsChoiceTelevisionAward = CriticsChoiceTelevisionAward;
	}
	
	
}

