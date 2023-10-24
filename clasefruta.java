package frutas;

public class clasefruta {
	private String nombre;
	private String color;
	private int peso;
	public clasefruta anterior;
	public clasefruta siguiente;
	
	public clasefruta(String nombre, String color, int peso) {
		
		this.nombre = nombre;
		this.color = color;
		this.peso = peso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}

}
