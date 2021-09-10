package ExerciciosJavaBootCampGeneration;

public class TesteAnimalPolimorfismo {

	public static void main(String[] args) {
			
			CachorroPolimorfismo cachorro = new CachorroPolimorfismo();
			CavaloPolimorfismo cavalo = new CavaloPolimorfismo ();
			PreguicaPolimorfismo preguica = new PreguicaPolimorfismo();
			AnimalPolimorfismo animal = null;
			
			int n = (int)(Math.random()*3.0);
			
			System.out.println("\nO numero escolhido foi: "+n);
			
			switch(n) {
			
			case 0: animal = cavalo;break;
			case 1: animal = preguica;break;
			case 2: animal = cachorro;break;
			default:System.out.println("\nErro inesperado!");
			}
			if (animal != null) {
				
				
				animal.som(3);
			}
			}
	}


