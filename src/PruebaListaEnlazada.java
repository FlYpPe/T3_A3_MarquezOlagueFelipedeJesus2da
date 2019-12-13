
public class PruebaListaEnlazada {
	public static void main(String[] args) {
		
		ListaEnlazada le = new ListaEnlazada();
		System.out.println("Agregar elementos");
		le.agregarElemenentoAlInicio(30);
		le.agregarElemenentoAlInicio(7);
		le.agregarElemenentoAlInicio(23);
		le.agregarElemenentoAlInicio(12);
		
		le.mostrarElementos();
		System.out.println("\n===============");
		le.eliminarInicio();
		System.out.println("Eliminar inicio");
		le.mostrarElementos();
		System.out.println("\n===============");
		le.insertarFinal(15);
		System.out.println("Agregar final");
		le.mostrarElementos();
		System.out.println("\n===============");
		le.eliminarFinal();
		System.out.println("Eliminar Final");
		le.mostrarElementos();
		System.out.println("\n===============");
		le.eliminarFinal();
		System.out.println("Eliminar final");
		le.mostrarElementos();
		System.out.println("\n===============");
		le.eliminarFinal();
		System.out.println("Eliminar final");
		le.mostrarElementos();
		System.out.println();
		System.out.println("Mostrar cantidad de elementos");
		System.out.println(le.mostrarCantidadElementos());
	}
}
