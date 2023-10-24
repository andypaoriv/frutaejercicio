package frutas;

public class listafruta {
	private String nombre;
	private clasefruta primero;
	private clasefruta ultimo;
	private clasefruta actual;
	 clasefruta anterior;
	 clasefruta aux2;

	public void insertarAlFinal (clasefruta nuevo) {
		if (primero == null) {
			primero = ultimo = nuevo;
			actual = nuevo;
		}
			else 
			{
}
			ultimo.siguiente= nuevo;
			ultimo = nuevo;
			actual = ultimo;
	}
	
	
	public clasefruta IrAlSiguiente() {
		if (actual.siguiente!= null)
			return actual.siguiente;
		else {
			
		
			actual = primero;
			return actual;
		}
	}
		
	public clasefruta IrAlAnterior() {
		clasefruta aux = primero;
		if (actual == primero)
			return null;
		else {
			while (aux.siguiente !=actual)
				aux =aux.siguiente;
			actual = aux;
			return actual;
		}
	}
	public void insertarInicio (clasefruta nuevo) {
		if (primero == null)
			primero = ultimo = nuevo;
		else
			nuevo.siguiente = primero;
		primero.anterior = nuevo;
		primero = nuevo;
		
	}

	public void insertarEnMedio (clasefruta nuevo) {
		clasefruta aux = primero;
		clasefruta aux2 = primero;
		if(primero == null)
			primero = ultimo = nuevo;
		else {
			while (nuevo.getNombre().equals(nombre)) {
			    aux2 = aux;
				aux=aux.siguiente = nuevo;
			}
			aux2.siguiente=nuevo;
			nuevo.siguiente=aux;
		}
	}


	public void insertarfinal (clasefruta nuevo) {
		if (primero == null)
			primero = ultimo = nuevo;
		else
			nuevo.anterior = ultimo;
			ultimo.siguiente = nuevo;
			ultimo = nuevo;
			}
	
	public void insertarDondeSea (clasefruta nuevo) {
		if (primero == null)
			primero = ultimo =aux2 = nuevo;
		else {
			int com= nuevo.getNombre().compareTo(ultimo.getNombre());
			if (com>0)
				insertarInicio(nuevo);
			int com2 = nuevo.getNombre().compareTo(primero.getNombre());
			
			if (com2<0)
				insertarfinal (nuevo);
			else
				insertarEnMedio(nuevo);
		}}
				
			
		}

	