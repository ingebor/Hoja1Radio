
public class Frecuencia {
	private String nombre;
	private int num;
	
	public Frecuencia() {
		nombre="";
		num = 0;
	}
	
	public Frecuencia(String nombre, int frecuencia) {
		this.nombre = nombre;
		this.num = num;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Frecuencia [nombre=" + nombre + ", num=" + num + "]";
	}
	
	
}
