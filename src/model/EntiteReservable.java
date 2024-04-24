package model;

public abstract class EntiteReservable <F extends Formulaire>{
	protected CalendrierAnnuel calendrier = new CalendrierAnnuel();
	protected int numero;

	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public boolean estLibre(F formulaire) {
		int jour = formulaire.getDateReservation();
		int mois = ;
		return calendrier.estLibre(jour, mois);
	}
	
	public abstract boolean compatible(F formulaire);
	
	public abstract Reservation reserver(F formulaire);

}

//tableaux
//interface classe abstrataites
//classes internes
//anonymes
//exceptions
//généricité