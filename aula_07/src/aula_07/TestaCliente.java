package aula_07;

public class TestaCliente {
	
	 public static void main(String[] args) {

		  Exer01_Cliente tc = new Exer01_Cliente("Jamile Farias" , 18, "Feminino" , "São Paulo" , "(11) 98856-0234");
	        tc.visualizar();
	        
	        System.out.println("\n");
	        
	        Exer01_Cliente tc1 = new Exer01_Cliente("Heimy Dias" , 19, "Feminino" , "São Paulo" , "(11) 92251-7349");
	        tc1.visualizar();
	        
	        PessoaFisica pf = new PessoaFisica ("Lucas" , 18, "Masculino" , "São Paulo" , "(11) 98856-0234", "887.764.098-65");
	        pf.visualizar();
	        
	        PessoaFisica pf1 = new PessoaFisica ("Jamile Farias" , 18, "Feminino" , "São Paulo" , "(11) 98856-0234", "445.654.987-98");
	    	pf1.visualizar();
	    	
	    	PessoaJuridica pj = new PessoaJuridica ("Jucie" , 18, "Masculino" , "São Paulo" ,"(11) 98856-0234","87.425.635/0001-77");
            pj.visualizar();

            PessoaJuridica pj1 = new PessoaJuridica ("chiquinho" , 18, "Masculino" , "São Paulo" ,"(11) 98856-0234","69.897.698/0001-49");
            pj1.visualizar();
}
}
