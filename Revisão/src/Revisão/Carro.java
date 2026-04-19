package Revisão;

public class Carro {
	static String modelo = "Fiesta";
	static String marca = "Ford";
	static int ano = 2010;

	public Carro(String modelo, String marca, int ano) {
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
	}

	public static void main(String[] args) {
		System.out.println("Modelo: " + modelo);
		System.out.println("Marca: " + marca);
		System.out.println("Ano:" + ano);
	}
}
