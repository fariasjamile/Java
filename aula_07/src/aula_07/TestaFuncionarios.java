package aula_07;


public class TestaFuncionarios {

    public static void main(String[] args) {


   Exer02_Funcionarios c1 = new Exer02_Funcionarios("Andresa" , 26, "RH" , "Assistente" , 2000.00f);
    c1.visualizar();
          
    Exer02_Funcionarios c2 = new Exer02_Funcionarios("Andresa" , 26, "RH" , "Assistente" , 2000.00f);
    c2.visualizar();
    
    Gerente gt = new Gerente("Maria" , 26, "TECH" , "Gerente de Projetos" , 9000.00f, "Gerencia");
    gt.visualizar();
    
    Gerente gt1 = new Gerente("Lina" , 24, "TECH" , "Gerente de Projetos" , 10000.00f, "Gerencia");
    gt1.visualizar();
    
    Vendedor vd = new Vendedor("Camile" , 29 , "Comercial" , "Vendedora" , 1000.00f, "Vendas");
    vd.visualizar();
    
    Vendedor vd2 = new Vendedor("kauane" , 32 , "Comercial" , "Vendedora" , 1000.00f, "Vendas");
    vd2.visualizar();
    }
}

    