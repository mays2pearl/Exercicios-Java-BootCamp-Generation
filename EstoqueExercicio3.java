package ExerciciosJavaBootCampGeneration;

import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueExercicio3 {

	public static void main(String[] args) {
		
		int op;
		Scanner leia = new Scanner (System.in);
		
		ArrayList <String> estoque = new ArrayList();
		
		do {
			
			System.out.println("\n\t\tSelecione uma opção abaixo");
			System.out.println("\n(1)Para adicionar um produto ao estoque");
			System.out.println("\n(2)Para remover um produto do estoque");
			System.out.println("\n(3)Para atualizar os produtos do estoque");
			System.out.println("\n(4)Para mostrar os produtos do estoque");
			System.out.println("\n(0)Para encerrar o programa");
			System.out.println("\nQual sua opção?");
			op = leia.nextInt();
			
			switch (op) {
			
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o produto para dicionar ao estoque:");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto para remover do estoque:");
				String produtor = leia.nextLine();
				estoque.remove(produtor);
				break;
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o produto que quer atualizar no estoque:");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o produto que entrara no estoque:");
				String novo = leia.nextLine();
			
					if(estoque.contains(verifica)){
						
						estoque.remove(verifica);
						estoque.add(novo);
					}else{
						
						System.out.println("\nProduto não existe");
					}
					
					System.out.println(estoque);
					break;
			case 4:
				System.out.println("\nOs produtos do estoque são: ");
				System.out.println(estoque);
				
			case 0:
				System.out.println("\nPrograma finalizado!");
				break;
				default:
					System.out.println("\nOpção invalida! ");	
			}
			
			
		}while (op!=0);

}


	}


