package tasca11;

public class Moneda {

	private String nombre;
	private float precio;

	public Moneda(String nombre, float precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		EventoPrecio event = new EventoPrecio(this,this.precio,precio);
		this.precio = precio;
	}
}
