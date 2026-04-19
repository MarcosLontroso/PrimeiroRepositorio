package Revisão;

public class Aluno {
	double grade;
	String name;

	public String testGrade(double grade) {
		if(grade >= 7) return "Aprovado";
		else return "Reprovado";
	}
}
