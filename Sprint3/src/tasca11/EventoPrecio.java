package tasca11;

public class EventoPrecio {
	private Moneda moneda;
	private float precioAntiguo;
	private float precioNuevo;

	public EventoPrecio(Moneda moneda, float precioAntiguo, float precioNuevo) {
		super();
		this.moneda = moneda;
		this.precioAntiguo = precioAntiguo;
		this.precioNuevo = precioNuevo;
	}

	public Moneda getMoneda() {
		return moneda;
	}

	public float getPrecioAntiguo() {
		return precioAntiguo;
	}

	public float getPrecioNuevo() {
		return precioNuevo;
	}

}
