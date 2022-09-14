package n1ex1;

import java.util.ArrayList;

public class AgentBorsa implements Observable {
	private String nom;
	private float puntuacioBorsa = 0;
	private ArrayList<Observer> agencies;
	
	public AgentBorsa(String nom, float puntuacioBorsa, ArrayList<Observer> agencies) {
		super();
		this.nom = nom;
		this.puntuacioBorsa = puntuacioBorsa;
		this.agencies = agencies;
	}

	@Override
	public void attach(Observer o) {
		agencies.add(o);
		// TODO Auto-generated method stub

	}

	@Override
	public void detach(Observer o) {
		agencies.remove(o);
		// TODO Auto-generated method stub

	}

	@Override
	public void notifyChange(float novaPuntuacio) {
		for (int i = 0; i < agencies.size(); i++) {
			agencies.get(i).update(this.nom, this.puntuacioBorsa, novaPuntuacio);
		}
		// TODO Auto-generated method stub

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getPuntuacioBorsa() {
		return puntuacioBorsa;
	}

	public void setPuntuacioBorsa(float puntuacioBorsa) {

		this.puntuacioBorsa = puntuacioBorsa;
		this.notifyChange(puntuacioBorsa);
	}

	public ArrayList<Observer> getAgencies() {
		return agencies;
	}

	public void setAgencies(ArrayList<Observer> agencies) {
		this.agencies = agencies;
	}

}
