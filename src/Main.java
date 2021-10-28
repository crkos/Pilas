import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws Exception {
            Pila pila = new Pila(2);
            int seleccion = 0;
            Scanner in = new Scanner(System.in);

                do {
                    System.out.println("\nMenu:"
                            + "\n1.- Insertar dato en la pila"
                            + "\n2.- Quitar dato de la pila"
                            + "\n3.- Checar si esta vacia la pila"
                            + "\n4.- Checar si esta llena la pila"
                            + "\n5.- Mostrar la cima de la pila"
                            + "\n6.- Vaciar la pila"
                            + "\n7.- Mostrar el tamaño de la pila"
                            + "\n0.- Salir");
                    System.out.println("Seleccion: ");
                    seleccion = in.nextInt();
                    System.out.println("");

                    switch(seleccion)
                    {
                    case 1:
                    
                        int insertar;
                        System.out.print("Escribe el numero a insertar: ");
                        insertar = in.nextInt();
                        pila.insertar(insertar);
                        break;
                    case 2:
                        pila.quitar();

                        break;
                    case 3:
                        pila.vacia();
                        break;
                    case 4:
                        pila.llena();
                        break;
                    case 5:
                        pila.mostrarCima();
                        break;
                    case 6:
                        pila.vaciar();
                        break;
                    case 7:
                        pila.tamanio();
                        break;
                    }
                }while(seleccion!=0);
        }

}