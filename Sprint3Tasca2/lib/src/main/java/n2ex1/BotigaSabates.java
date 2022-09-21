package n2ex1;

public class BotigaSabates {

	private String nom;
	
	
	
	public BotigaSabates(String nom) {
		super();
		this.nom = nom;
	}

	public void realitzarPagament (Callback callback) {
		Pasarela pasarela = new Pasarela (this,callback);
		pasarela.execute();
	}

	public void transaccioRealitzada() {
		System.out.println("Pagament realiztat a la botiga " + this.nom);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
