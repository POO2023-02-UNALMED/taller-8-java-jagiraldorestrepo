package futbol;


public class Jugador extends Futbolista{
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador() {
		super();
		this.golesMarcados=(short) 289;
		this.dorsal=(byte) 7;
	}
	
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados=golesMarcados;
		this.dorsal=dorsal;
	}
	
	
	
}