package futbol;

public abstract class Futbolista implements Comparable<Object>{
	private String nombre;
	private int edad;
	private final String posicion;
	
	public Futbolista(String nombre, int edad, String posicion) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	//////////////////////
	public Futbolista() {
		this("Maradona",30,"delantero");
	}
	//////////////////////
	public String toString() {
		return "El futbolista "+nombre+" tiene "+edad+ ", y juega de "+posicion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPosicion() {
		return posicion;
	}
	//////////////////////
	public boolean equals(Futbolista o) {
        boolean resultado=false;
        if (this.edad==o.edad && this.nombre.equals(o.nombre) && this.posicion.equals(o.posicion) && System.identityHashCode(this)==System.identityHashCode(o)) {
        	resultado=true;
        }
        return resultado;
    }
	//////////////////////
	public abstract boolean jugarConLasManos();
	//////////////////////
	public int compareTo(Futbolista o) {
		return 0;
	}

	public int compareTo(Object o) {
		return 0;
	}
	
	
}