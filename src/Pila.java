public class Pila {
    //Atributos
	int cima;
	int max;
	int espacio[];
	
	//Constructor
	public Pila(int tamanio) {
		cima = -1;
		max = tamanio;
		espacio = new int[max];
	}
	
	public void insertar(int valor) {
		
	}
	
	public int quitar() {
	
		return 0; //Modificar por el valor que se quita
	}
	
	public boolean vacia() {
		
		return false; //Cambiar dependiendo del resultado
	}
	
	public boolean llena() {
		
		
		return true; //Cambiar dependiendo del resultado
	}
	
	public int mostrarCima() {
		
		return 0; //Cambiar por el valor de la cima
	}
	
	public void vaciar() {
		
	}
	
	public int tamanio() {
		
		return 0; //Cambiar por el valor del tama�o
	}
}
