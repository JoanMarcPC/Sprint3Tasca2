package n1ex1;

import java.util.Objects;

public class AgenciaBorsa implements Observer {

	private String nom;

	public AgenciaBorsa(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public void update(String nom, float puntuacioAntiga, float puntuacioActual) {
		System.out.println(" Agencia de Borsa " + this.nom + "Notificació:\nL'Agent de Borsa: " + nom
				+ " ha canviat la seva puntuació de: " + puntuacioAntiga + "punts a: " + puntuacioActual + " punts.");
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "AgenciaBorsa [nom=" + nom + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AgenciaBorsa other = (AgenciaBorsa) obj;
		return Objects.equals(nom, other.nom);
	}

}
