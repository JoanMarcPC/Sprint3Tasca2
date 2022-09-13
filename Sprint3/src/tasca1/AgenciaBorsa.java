package tasca1;

import tasca11.Observer;

public class AgenciaBorsa implements Observer {

	private String nombre;

	public AgenciaBorsa(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void update() {
		
		// TODO Auto-generated method stub

	}

}
