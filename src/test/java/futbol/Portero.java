package futbol;

public class Portero extends Futbolista{
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero() {
		
	}
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos=golesRecibidos;
		this.dorsal=dorsal;
	}
 
	

}
