package produits;

public class Poisson extends Produit {
	private String nom;
	private Unite unite;
	private String datePeche;

	public Poisson(String nom, String datePeche) {
		super("poisson", Unite.PIECE);
		this.datePeche = datePeche;
	}

	@Override
	public void decrireProduit() {
		System.out.println("poisson pechés" + datePeche + ".");
	}
}
