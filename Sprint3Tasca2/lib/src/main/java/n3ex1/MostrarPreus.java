package n3ex1;

import java.util.ArrayList;

public class MostrarPreus {
	private ArrayList<Article> articles;
	private ConvertidorMoneda convertidor;

	public MostrarPreus(ArrayList<Article> articles, ConvertidorMoneda convertidor) {
		super();
		this.articles = articles;
		this.convertidor = convertidor;
	}

	public void mostrar() {
		for (int i = 0; i < articles.size(); i++) {

			System.out.println("Article: " + articles.get(i).getNom() + "\tPreu Euros: " + articles.get(i).getPreuEuros()
					+ "\tPreu dolars: " + convertidor.conversioDolar(articles.get(i).getPreuEuros())
					+ "\t Preu lliura: " + convertidor.conversioLliura(articles.get(i).getPreuEuros())
					+ "\t Preu PesoMex: " + convertidor.conversioPesoMex(articles.get(i).getPreuEuros()));

		}
	}

}
