package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;

	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	public void direBonjour() {
		System.out.println("(" + nom + ") - Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boissonFavorite);
	}

	public void boire() {
		System.out.println("(" + nom + ") - Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}

	public void gagnerArgent(int gain) {
		argent += gain;
	}

	public void perdreArgent(int perte) {
		argent -= perte;
	}

	public void acheter(String bien, int prix) {
		perdreArgent(prix);
	}

	public void parler(int prix, String truc) {
		if (prix <= argent) {
			System.out.println("(" + nom + ") - J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir un(e) "
					+ truc + " à " + prix + " sous");
		} else {
			System.out.println("(" + nom + ") -Je n'ai plus que " + argent
					+ " sous en poche. Je ne peux même pas m'offrir un(e) " + truc + " à " + prix + " sous.");
		}
	}
}
