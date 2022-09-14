package n1ex1;

public interface Observable {
	public void attach(Observer o);

	public void detach(Observer o);

	public void notifyChange(float novaPuntuacio);

}
