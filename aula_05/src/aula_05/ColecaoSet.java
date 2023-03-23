package aula_05;

		import java.util.HashSet;
		import java.util.Iterator;
		import java.util.Set;

		public class ColecaoSet {

			public static void main(String[] args) {
				
   				Set<String> setFrutas = new HashSet<String>();
				//set estrura de dados, sem indice, não ordado e sem repetição// //a partir de hash tudo que eu escrver abaixo vai ser armazenado ena variavel no caso setfrutas
				setFrutas.add("Abacate");
				setFrutas.add("Banana");
				setFrutas.add("Jaboticaba");
				setFrutas.add("Kiwi");
				setFrutas.add("Maçã");
				setFrutas.add("Morango");
				setFrutas.add("Pêra");
				setFrutas.add("Jaboticaba");
				setFrutas.add("Kiwi");
				setFrutas.add("KIWI");
				
				Iterator<String> isetFrutas = setFrutas.iterator();
                // interator é pro sistema percorrer por todos os objetos// 
				
				while (isetFrutas.hasNext()) {
					/*hasnext é leia o proximo */
					System.out.println(isetFrutas.next());
					
				}

				for(var fruta : setFrutas)
					System.out.println(fruta.hashCode());
				
				System.out.println("Existe a fruta manga?" + setFrutas.contains("manga"));
				//set frutas.contains
				
				setFrutas.remove("Kiwi");
				
				for(var fruta : setFrutas)
					System.out.println(fruta);
			}
	}


	