package produtos;

import java.util.Scanner;

public class TesteProduto {

	public static void main(String[] args) {
		ProdutosDAO dao = new ProdutosDAO();
		Scanner scInt = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		Scanner scDouble = new Scanner(System.in);
		
		String nome_produto; double quantidade; int cod_unidade; int id_produto; double preco_unitario;
		
		int condition1=0; 
		String condition2=null;
		
		do {
			System.out.println("INDIQUE A OPERAÇÃO DESEJADA");
			System.out.println("1 - Inserir;");
			System.out.println("2 - Listar;");
			System.out.println("3 - Atualizar;");
			System.out.println("4 - Deletar.");
			System.out.println("5 - Sair do Programa.\n");
			System.out.print("Indique aqui: ");
			condition1 = scInt.nextInt();
			System.out.println();
			
			switch (condition1) {
			case 1:
				do {
					System.out.println("OPÇÃO INSERIR");
					System.out.println("-------------");
					System.out.print("Inserir nome do produto: "); nome_produto = scString.nextLine();
					System.out.print("Inserir quantidade do produto: "); quantidade = scDouble.nextDouble();
					System.out.print("Inserir código do produto: "); cod_unidade = scInt.nextInt();
					System.out.print("Inserir preço unitário do produto: "); preco_unitario = scDouble.nextDouble();
					System.out.println("-------------");
					
					dao.inserir(nome_produto, quantidade, cod_unidade, preco_unitario);
					
					System.out.println("Deseja inserir mais? 'sim' ou 'não'? "); condition2 = scString.nextLine();
					
				} while (condition2.equals("sim"));
				System.out.println("Voltando ao meunu...");
				System.out.println("-------------\n");
				break;
				
			case 2: 
				 System.out.println("OPÇÃO LISTAR");
				 System.out.println("-------------");
				 System.out.println("Lista de produtos:\n");
			     for (String aluno : dao.listar()) System.out.println(aluno);
			     System.out.println();
			     System.out.println("Voltando ao meunu...");
				 System.out.println("-------------\n");
				break;
				
			case 3: 
				do {
					System.out.println("OPÇÃO ATUALIZAR");
					System.out.println("-------------");
					System.out.print("Nome do produto: "); nome_produto = scString.nextLine();
					System.out.print("Quantidade do produto: "); quantidade = scDouble.nextDouble();
					System.out.print("Inserir código do produto: "); cod_unidade = scInt.nextInt();
					System.out.print("Inserir preço unitário do produto: "); preco_unitario = scDouble.nextDouble();
					System.out.print("ID do produto que deseja atualizar: "); id_produto = scInt.nextInt();
					System.out.println("-------------");
					
					dao.atualizar(nome_produto, quantidade, cod_unidade, id_produto, preco_unitario);
					
					System.out.println("Deseja inserir mais? 'sim' ou 'não'?"); condition2 = scString.nextLine();
					
				} while (condition2.equals("sim"));
				System.out.println("Voltando ao meunu...");
				System.out.println("-------------\n");
				break;
				
				
			case 4:
				System.out.println("OPÇÃO DELETAR");
				System.out.println("-------------");
				System.out.print("ID do produto que deseja deletar: "); id_produto = scInt.nextInt();
				dao.deletar(id_produto);
				System.out.println("Voltando ao meunu...");
				System.out.println("-------------\n");
				break;
				
			case 5:
				System.out.println("Saindo do programa...\n");
				break;
				
			default:
				System.out.println("ERROR 404\n");
			}
			
			
		} while (condition1 != 5);
	}

}
