package histoire;

import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Humain h = new Humain("Prof","kombucha",54);
		h.direBonjour();
		h.parler(12,"boisson");
		h.boire();
		h.perdreArgent(12);
		h.parler(2,"jeu");
		h.parler(50,"kimono");
		

	}

}
