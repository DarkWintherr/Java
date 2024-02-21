package projeto1;

import java.util.Scanner;

public class Cadastro {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nome: ");        //NOME
		String nome = input.nextLine();		
		
		System.out.print("Sobrenome: ");		//SOBRENOME
		String sobrenome = input.nextLine();
		
		System.out.print("Idade: ");		//IDADE
		int idade = input.nextInt();
		
		System.out.print("Telefone sem espaços: ");        //TELEFONE
		String telefone = input.next();	
		
		System.out.println("    ");
		System.out.printf("=== PESSOA CADASTRADA COM SUCESSO ===\n");
		System.out.println("   ");
		System.out.printf("-Nome: %s\n", nome);
		System.out.printf("-Sobrenome: %s\n", sobrenome);
		System.out.printf("-Idade: %d\n", idade);
		System.out.printf("-Telefone: %s\n", telefone);
		System.out.println("  ");
		System.out.println("=======================================");
		
		input.close();

	}
}

