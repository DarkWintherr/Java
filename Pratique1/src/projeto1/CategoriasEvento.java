package projeto1;

import java.util.Scanner;

public class CategoriasEvento {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
        System.out.println("===CATEGORIAS EVENTO===");
        System.out.println("     ");
        System.out.println("| 1- Festas e Celebrações");
        System.out.println("| 2- Eventos Esportivos");
        System.out.println("| 3- Shows e Concertos");
        System.out.println("    ");
        System.out.println("========================");
        
        System.out.print("Qual opção desejada?: ");
        int opcao = input.nextInt();
        
        
        if (opcao == 1) {
        	
        	System.out.println("|=|Data evento|=|");
        	System.out.println("   ");
        	
        	
        	System.out.print("Dia: ");
        	int dia = input.nextInt();
        	
        	System.out.print("Mês: ");
        	String mes = input.next();
        	
        	System.out.print("Ano: ");
        	int ano = input.nextInt(); 
        	
        	input.nextLine();

        	System.out.print("Endereço completo: ");
        	String endereco = input.nextLine();
        	
        	System.out.print("Horario desejado formato HORA - MINUTO: ");
        	String horario = input.nextLine();
        	
        	System.out.print("Quantidade de convidados: ");
        	int quantidade = input.nextInt();
        	
        	System.out.println("   ");
        	System.out.println("===EVENTO CADASTRADO COM SUCESSO===");
        	System.out.println("   ");
        	System.out.println("-Categoria: Festas e Celebrações");
        	System.out.printf("-Data: %d/%s/%d\n ", dia, mes, ano);
        	System.out.printf("-Endereço: %s\n", endereco);
        	System.out.printf("-Convites: %d\n", quantidade);

        }
        
        if (opcao == 2) {
        	
        	System.out.println("|=|Data evento|=|");
        	System.out.println("   ");
        	
        	
        	System.out.print("Dia: ");
        	int dia = input.nextInt();
        	
        	System.out.print("Mês: ");
        	String mes = input.next();
        	
        	System.out.print("Ano: ");
        	int ano = input.nextInt(); 
        	
        	input.nextLine();

        	System.out.print("Endereço completo: ");
        	String endereco = input.nextLine();
        	
        	System.out.print("Horario desejado formato HORA - MINUTO: ");
        	String horario = input.nextLine();
        	
        	System.out.print("Quantidade de convidados: ");
        	int quantidade = input.nextInt();
        	
        	System.out.println("   ");
        	System.out.println("===EVENTO CADASTRADO COM SUCESSO===");
        	System.out.println("   ");
        	System.out.println("-Eventos Esportivos");
        	System.out.printf("-Data: %d/%s/%d\n ", dia, mes, ano);
        	System.out.printf("-Endereço: %s\n", endereco);
        	System.out.printf("-Convites: %d\n", quantidade);

        }
        
        if (opcao == 3) {
        	
        	System.out.println("|=|Data evento|=|");
        	System.out.println("   ");
        	
        	
        	System.out.print("Dia: ");
        	int dia = input.nextInt();
        	
        	System.out.print("Mês: ");
        	String mes = input.next();
        	
        	System.out.print("Ano: ");
        	int ano = input.nextInt(); 
        	
        	input.nextLine();

        	System.out.print("Endereço completo: ");
        	String endereco = input.nextLine();
        	
        	System.out.print("Horario desejado formato HORA - MINUTO: ");
        	String horario = input.nextLine();
        	
        	System.out.print("Quantidade de convidados: ");
        	int quantidade = input.nextInt();
        	
        	System.out.println("   ");
        	System.out.println("===EVENTO CADASTRADO COM SUCESSO===");
        	System.out.println("   ");
        	System.out.println("-Shows e Concertos");
        	System.out.printf("-Data: %d/%s/%d\n ", dia, mes, ano);
        	System.out.printf("-Endereço: %s\n", endereco);
        	System.out.printf("-Convites: %d\n", quantidade);
        }
    	   
       
        
        
        
        
        
        
        
	}

}
