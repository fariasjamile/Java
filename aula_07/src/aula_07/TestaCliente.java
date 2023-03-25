package aula_07;

public class TestaCliente {
	
	 public static void main(String[] args) {

		  Exer01_Cliente tc = new Exer01_Cliente("Jamille Farias" , 18, "Feminino" , "São Paulo" , "(11) 98856-0234");
	        tc.visualizar();
	        
	        System.out.println("\n");
	        
	        Exer01_Cliente tc1 = new Exer01_Cliente("Heimy Dias" , 19, "Feminino" , "São Paulo" , "(11) 92251-7349");
	        tc1.visualizar();
}

}
