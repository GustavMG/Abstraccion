package abstraccion;

public class TestAbstraccion {

	public static void main(String[] args) {
		
		//Instancia de la clase automovil
		Automovil mytroquita = new Automovil();
		//Instancia de la clase motocicleta
		Motocicleta ninja = new Motocicleta();
		
		//Lamamos a los metodos de cada instancia
		mytroquita.acelerar();
		ninja.acelerar();
		
		mytroquita.frenar();
		ninja.frenar();

	}

}
