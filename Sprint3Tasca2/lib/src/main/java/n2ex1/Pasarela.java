package n2ex1;

public class Pasarela {
	private BotigaSabates botiga;
	private Callback pagament;
	
	public Pasarela(BotigaSabates botiga, Callback pagament) {
		super();
		this.botiga = botiga;
		this.pagament = pagament;
	}
	
	public void execute() {
		pagament.execute();
		botiga.transaccioRealitzada();
	}
	
	
}
