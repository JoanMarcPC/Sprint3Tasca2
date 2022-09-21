package n3ex1;

public class Article {

	private String nom;
	private double preuEuros;

	public Article(String nom, double preuEuros) {
		super();
		this.nom = nom;
		this.preuEuros = preuEuros;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPreuEuros() {
		return preuEuros;
	}

	public void setPreuEuros(double preuEuros) {
		this.preuEuros = preuEuros;
	}

}
