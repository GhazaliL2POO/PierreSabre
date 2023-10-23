package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
		// TODO Auto-generated constructor stub
	}
	public int seFaireExtorquer() {
		int sommeVol=this.argent;
		this.argent=0;
		this.parler("J'ai tout perdu le monde est vraiment trop injuste");
		return sommeVol;
	}
	public void recevoir(int arg) {
		this.argent+=arg;
		this.parler(arg+" sous ! Je te remercie généreux donateur!");
	}
}
