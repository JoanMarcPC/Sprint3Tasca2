package n1ex1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//preparar dades 
		ArrayList<Observer> agencies = new ArrayList<Observer>();
		agencies.add(new AgenciaBorsa("DeGiro"));
		agencies.add(new AgenciaBorsa("SuperCoin"));
		agencies.add(new AgenciaBorsa("Crypto"));
		agencies.add(new AgenciaBorsa("Brokers Bros"));
		agencies.add(new AgenciaBorsa("Invierte Y Gana"));
		agencies.add(new AgenciaBorsa("AgenciaRandom"));
		agencies.add(new AgenciaBorsa("AgenciaRandom2"));
		AgentBorsa agent = new AgentBorsa("Ibex35", 2323.45, agencies);
		AgentBorsa agent2 = new AgentBorsa("DOW JONES",  156582.654, agencies);
		
		// afegir observers
		agent.attach(new AgenciaBorsa("Invierte Y Gana2"));
		System.out.println(agent.getAgencies().toString());
		// retirar observers
		agent.detach(new AgenciaBorsa("Invierte Y Gana2"));
		System.out.println(agent.getAgencies().toString());
		
		// notificacions de canvis als observers
		agent.setPuntuacioBorsa(4458.55);
		agent2.setPuntuacioBorsa(14254.365);
		

	}

}
