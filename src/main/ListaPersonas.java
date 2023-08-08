package main;

import java.util.LinkedHashMap;
import java.util.Map;

public class ListaPersonas {
	private LinkedHashMap<String, Integer> personas = new LinkedHashMap<>();
	
	public void agregarPersona(String nombre, int edad){
		if (personas.containsKey(nombre)) {// Se verifica que el nombre no este en la lista.
			System.out.println("Ese nombre ya esta en la lista");
		} else{
			personas.put(nombre, edad);// Se agrega el nombre a la lista.
			System.out.println("La persona fue agregada correctamente");
		}
	}
	public void eliminarPersona(String nombre) {
		if (!personas.containsKey(nombre)) {// Se verifica si el nombre esta en la lista.
			System.out.println("Ese nombre no esta en la lista");
		} else{
			personas.remove(nombre);// Se elimina el nombre de la lista.
			System.out.println("La persona fue eliminada correctamente");
		}
	}
	public void actualizarPersona(String nombre, int nuevaEdad) {
		if (!personas.containsKey(nombre)) {// Se verifica si el nombre esta en la lista.
			System.out.println("Ese nombre no esta en la lista");
		} else{
			personas.replace(nombre, nuevaEdad);// Se remplaza la edad de la persona ingresada con una nueva.
			System.out.println("La edad de la persona fue actualizada correctamente");
		}
	}
	public void mostrarPersona(int indice) {
		if (indice < 0 || indice >= personas.size()) {// Se verifica que haya la cantidad suficiente de personas para el indice.
			System.out.println("Ese indice no esta en la lista");
			System.out.println("El tamaño de la lista es de " + personas.size());
		} else{
			int indiceActual = 0;
			for(Map.Entry<String, Integer> entry: personas.entrySet()) {
				if(indiceActual == indice) {
					System.out.println("[" + entry.getKey() + ", " + entry.getValue() + "]");
					break;
				}
				indiceActual = indiceActual + 1;
			}
		}
	}
}
