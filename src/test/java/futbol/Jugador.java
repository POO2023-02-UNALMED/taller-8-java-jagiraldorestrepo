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
	
	public int compareTo(Futbolista o) {
		return Math.abs(this.getEdad()-o.getEdad());
	}
	
	@Override
	public boolean jugarConLasManos() {
		return false;
	}
	
	public String toString() {
		return "El futbolista "+getNombre()+" tiene "+getEdad()+ ", y juega de "+getPosicion()+" con el dorsal "+dorsal+ ". Ha marcado "+golesMarcados;
	}
	
	
}