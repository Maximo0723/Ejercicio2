package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);// Se declara el objeto scanner.
		ListaPersonas lista = new ListaPersonas();// Se declara el objeto lista que hereda los metodos de la clase ListaPersonas.
		int opcion;
		String nombre;
		int edad;
		int indice;
		while (true) {// Se usa un while con la condicion true para que siempre se ejecute porque true siempre sera igual a true.
			System.out.println("Ingresa una opción del 1 al 4");
			System.out.println("1) Agregar persona");
			System.out.println("2) Eliminar persona");
			System.out.println("3) Actualizar Persona");
			System.out.println("4) Mostrar Persona");
			opcion = scanner.nextInt();// Con un scanner le pido al usuario que ingrese un numero del 1 al 4.
			if (opcion <= 0 || opcion > 4) {
				System.out.println("Error, el numero debe estar entre 1 y 4");
			} else {
				switch (opcion) {// Dependiendo el numero ingresado en las opciones se va a ejecutar un caso del metodo switch.
				case 1:
					System.out.println("1) Agregar persona");
					System.out.println("Ingrese el nombre");
					nombre = scanner.next();// Se pide al usuario el nombre a agregar.
					System.out.println("Ingrese la edad");
					edad = scanner.nextInt();// Se pide al usuario la edad a agregar.
					lista.agregarPersona(nombre, edad);
					break;
				case 2:
					System.out.println("2) Eliminar persona");
					System.out.println("Ingrese el nombre de la persona");
					nombre = scanner.next();// Se pide al usuario el nombre de la persona que se quiere eliminar. 
					lista.eliminarPersona(nombre);
					break;
				case 3:
					System.out.println("3) Actualizar Persona");
					System.out.println("Ingrese el nombre de la persona");
					nombre = scanner.next();// Se pide al usuario el nombre de la persona a actualizar.
					System.out.println("Ingrese la nueva edad");
					edad = scanner.nextInt(); // Se pide al usuario la nueva edad de la persona.
					lista.actualizarPersona(nombre, edad);
					break;
				case 4:
					System.out.println("4) Mostrar Persona");
					System.out.println("Ingrese el indice");
					indice = scanner.nextInt();// Se pide el indice de la persona que se quiere mostrar.
					lista.mostrarPersona(indice);
					break;
				}
	
			}

		}

	}
}
