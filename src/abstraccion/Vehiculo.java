package abstraccion;

public abstract class Vehiculo {
	
	//Atributos
	public String marca;
	public int anio;
	
	//Metodo concreto
	public void mostrarInfo() {
		System.out.println("Mi auto es: " + marca + " y es del año: " + anio);
	}
	
	//Metodo abstracto
	public abstract void acelerar();
	public abstract void frenar();

}
