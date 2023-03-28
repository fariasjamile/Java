package aula_07;

public class Exer01_Cliente {

		protected String nome;
		private int idade;
		private String sexo;
		protected String cidade;
		private String telefone;
		private String cpf;
		
		public Exer01_Cliente (String nome, int idade, String sexo, String cidade, String telefone) {
			this.nome = nome;
			this.idade = idade;
			this.sexo = sexo;
			this.cidade = cidade;
			this.telefone = telefone;
	
	}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}

		public String getCidade() {
			return cidade;
		}

		public void setCidade(String cidade) {
			this.cidade = cidade;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		
		public void visualizar() {
			System.out.println("Nome: " + this.nome);
			System.out.println("Idade: " + this.idade);
			System.out.println("Sexo: " + this.sexo);
			System.out.println("Cidade: " + this.cidade);
			System.out.println("Telefone: " + this.telefone);
			System.out.println("CPF: " + this.cpf);
		}
}
