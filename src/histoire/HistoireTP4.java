package histoire;

import personnages.Commercant;
import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Humain h = new Humain("Prof","kombucha",54);
		h.direBonjour();
		h.parler("J'ai "+h.getArgent()+" sous en poche. Je vais pouvoir m'offrir une boisson à 12 sous");
		h.boire();
		h.perdreArgent(12);
		h.parler("J'ai "+h.getArgent()+" sous en poche. Je vais pouvoir m'offrir un jeu à 2 sous");
		h.perdreArgent(2);
		h.parler("Je n'ai plus que "+h.getArgent()+" sous en poche. Je ne peux même pas m'offrir un kimono à 50 sous");
		Commercant c = new Commercant("Marco",20);
		c.direBonjour();
		c.seFaireExtorquer();
		c.recevoir(15);
		c.boire();

	}

}
