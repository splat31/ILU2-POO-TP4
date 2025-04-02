package produits;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private String nom;
	private Unite unite;
	private int poids;
	private Gaulois chasseur;

	public Sanglier(String nom, int poids, Gaulois chasseur) {
		super("sanglier", Unite.KILOGRAMME);
		this.poids = poids;
		this.chasseur = chasseur;
	}

	@Override
	public void decrireProduit() {
		System.out
				.println("sanglier de " + poids + " " + unite.getSymbole() + " chassés par " + chasseur.getNom() + ".");
	}
}
