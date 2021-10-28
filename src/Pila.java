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
        boolean llena = llena();
		if (llena == true) {
            System.out.println("La pila esta llena, no se pueden insertar mas datos!");
        }
        else{
            cima = cima+1;
            espacio[cima] = valor;
            System.out.println("Se inserto el dato en la pila!");
        }
    }
	public int quitar() {
        int datoExtraido = espacio[cima];
        boolean vacia = vacia();
        if (vacia == true) {
            System.out.println("La pila esta vacia, no se puede sacar un dato");
        }
        else{
            cima = cima-1;
        }
        System.out.println("Dato extraido de la pila: "+ datoExtraido);
		return datoExtraido; //Modificar por el valor que se quita
	}
	
	public boolean vacia() {
		if (cima == -1) {
            System.out.println("La pila esta vacia!");
            return true;
        }
        else{
            System.out.println("La pila no esta vacia!");
            return false;
        }
	}
	
	public boolean llena() {
        int tamano;
        tamano = tamanio();
		if(tamano >= max){
            System.out.println("La pila esta llena!");
            return true;
        }
        else{
            System.out.println("La pila no esta llena!");
            
        }
        return false;
    
	}
	
	public int mostrarCima() {
        int ultimoElemento = espacio[cima];
		if (vacia() == true) {
            System.out.println("La pila esta vacia!");
        }
        else{
            System.out.println("La cima es: "+ultimoElemento);
        }
        return ultimoElemento;    
        //Cambiar por el valor de la cima
	}
	
	public void vaciar() {
		cima = -1;
        System.out.println("Se ha vaciado la pila");
	}
	
	public int tamanio() {
        int tam;
		tam = cima+1;
        System.out.println(("El tamano de la pila es: "+tam));
		return tam; //Cambiar por el valor del tamano
	}
}
