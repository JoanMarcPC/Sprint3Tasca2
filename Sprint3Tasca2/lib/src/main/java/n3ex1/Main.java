package n3ex1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		ArrayList<Article> articles = new ArrayList<Article>();
		articles.add(new Article("motocicleta", 15000));
		articles.add(new Article("tele", 506));
		articles.add(new Article("mobil", 1565));
		articles.add(new Article("ordinador", 1000));
		articles.add(new Article("teclat", 50));
		articles.add(new Article("ratoli", 25));
		articles.add(new Article("periferic", 15.6));

		// dependencies
		ConvertidorMoneda convertidor = new ConvertidorMoneda();
		// injecció
		MostrarPreus mostra = new MostrarPreus(articles, convertidor);
		mostra.mostrar();

	}

}
