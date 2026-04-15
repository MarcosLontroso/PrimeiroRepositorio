package Revisão;

import java.util.Scanner;

public class Carro {
	static String modelo;
	static String marca;
	static int ano;
	
	public static void main(String[] args) {
		Carro carro = new Carro(modelo, marca, ano);
		Scanner lerDados = new Scanner (System.in);
		System.out.println("Digite o modelo do carro: ");
		String modelo1 = lerDados.nextLine();
		System.out.println("Digite a marca do carro: ");
		String marca1 = lerDados.nextLine();
		System.out.println("Digite o ano do carro: ");
		int ano1 = lerDados.nextInt();
		
		modelo1 = Carro.modelo;
		marca1 = Carro.marca;
		ano1 = Carro.ano;
		}

	public Carro(String modelo, String marca, int ano) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		
		System.out.println(modelo);
		System.out.println(marca);
		System.out.println(ano);
	}
}
