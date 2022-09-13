package tasca1;

import java.util.ArrayList;

import tasca11.Observable;
import tasca11.Observer;

public class AgentBorsa implements Observable {

	private ArrayList<AgenciaBorsa> suscriptors = new ArrayList<AgenciaBorsa>();

	@Override
	public void attach(Observer o) {
		// TODO Auto-generated method stub
		suscriptors.add((AgenciaBorsa) o);

	}

	@Override
	public void detach(Observer o) {
		AgenciaBorsa a = (AgenciaBorsa) o;
		// TODO Auto-generated method stub
		suscriptors.remove(a);
	}

	@Override
	public void notify1() {
		// TODO Auto-generated method stub
		for (Observer agencia : suscriptors) {
			agencia.update();
		}
	}

}
