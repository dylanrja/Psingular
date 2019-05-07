package modelo;

public class Cubo extends Cuadrado{
	public Cubo(int lado) {
		super(lado);
	}
	
	
	public int calcularVolumen() {
		return this.getLado()*this.getLado()*this.getLado();
	}
	
	public int calcularPerimetroc() {
		return this.getLado()*12;
	}
}
