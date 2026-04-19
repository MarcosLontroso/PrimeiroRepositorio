package Revisão;

import java.util.Scanner;

public class TesteAluno {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		Scanner sc = new Scanner(System.in);
		double grade = 0;
		
		System.out.println("Nota: ");
		grade = sc.nextDouble();
		
		System.out.println("Status: " + aluno.testGrade(grade));
	} 
}
