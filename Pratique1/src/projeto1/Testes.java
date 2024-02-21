package projeto1;

import java.util.Scanner;

public class Testes {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int gradeCounter = 1;
		
		while (gradeCounter <= 10) {
			
			System.out.print("Enter grade: ");
			int grade = input.nextInt();
			total = total + grade;
			
			gradeCounter = gradeCounter + 1;
			
			
		}
		
		
	}

}
