package n1ex1;

import java.util.ArrayList;

public class AgentBorsa implements Observable {
	private String nom;
	private double puntuacioBorsa = 0;
	private ArrayList<Observer> agencies;

	public AgentBorsa(String nom, double puntuacioBorsa, ArrayList<Observer> agencies) {
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
	public void notifyChange(double novaPuntuacio) {
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

	public double getPuntuacioBorsa() {
		return puntuacioBorsa;
	}

	public void setPuntuacioBorsa(double puntuacioBorsa) {

		this.notifyChange(puntuacioBorsa);
		this.puntuacioBorsa = puntuacioBorsa;

	}

	public ArrayList<Observer> getAgencies() {
		return agencies;
	}

	public void setAgencies(ArrayList<Observer> agencies) {
		this.agencies = agencies;
	}

}
