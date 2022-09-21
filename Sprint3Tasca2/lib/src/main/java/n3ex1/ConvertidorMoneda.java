package n3ex1;

public class ConvertidorMoneda {
	// factor conversio de euro a altres monedes 15-09-2002
	private double dolar = 1;
	private double lliura = 0.87;
	private double pesoMex = 20;

	public double conversioDolar(double euros) {
		euros*=dolar;
		return euros;
	}
	public double conversioLliura(double euros) {
		euros*=lliura;
		return euros;
	}
	public double conversioPesoMex(double euros) {
		euros*=pesoMex;
		return euros;
	}
	public double getDolar() {
		return dolar;
	}
	public void setDolar(double dolar) {
		this.dolar = dolar;
	}
	public double getLliura() {
		return lliura;
	}
	public void setLliura(double lliura) {
		this.lliura = lliura;
	}
	public double getPesoMex() {
		return pesoMex;
	}
	public void setPesoMex(double pesoMex) {
		this.pesoMex = pesoMex;
	}
	
}
