package n2ex1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BotigaSabates botiga = new BotigaSabates("Zapateria");
		PagamentBancari p1 = new PagamentBancari();
		PagamentPayPal p2 = new PagamentPayPal();
		PagamentTargeta p3 = new PagamentTargeta();
		botiga.realitzarPagament(p1);
		botiga.realitzarPagament(p2);
		botiga.realitzarPagament(p3);
	}

}
