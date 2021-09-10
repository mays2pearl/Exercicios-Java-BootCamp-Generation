package ExerciciosJavaBootCampGeneration;

public abstract class AnimalPolimorfismo {

	private String tipo;
	
	abstract public void som(int tipoSom);
	
	public AnimalPolimorfismo(String tipo) {
		
		this.tipo = tipo;
		
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	
}
}
