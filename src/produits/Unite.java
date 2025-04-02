package produits;

public enum Unite {
	GRAMME("g"), KILOGRAMME("kg"), LITRE("l"), CENTILITRE("cl"), MILLILITRE("ml"), PIECE("piece");

	private final String symbole;

	Unite(String symbole) {
		this.symbole = symbole;
	}

	public String getSymbole() {
		return symbole;
	}

	@Override
	public String toString() {
		return symbole;
	}
}
