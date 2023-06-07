package moviesorte;

	public class Terror extends Serie{
		
		private String rottenTomatoes;

		public Terror(String nome, String genero, String[] atores, double imdb, String sinopse, int ano, String rottenTomatoes) {
			super(nome, genero, atores, imdb, sinopse, ano);
			this.rottenTomatoes = rottenTomatoes;
			
		}
		public String getRottentomatoes() {
			return rottenTomatoes;
		}

		public String setRottentomatoes(String Rottentomatoes) {
			return rottenTomatoes;
		}

	}
