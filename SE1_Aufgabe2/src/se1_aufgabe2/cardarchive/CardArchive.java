package se1_aufgabe2.cardarchive;

import java.util.Collection;
import java.util.UUID;

import se1_aufgabe2.accounting.IAccountingRegistry;
import se1_aufgabe2.cardarchive.antwort.Antwort;
import se1_aufgabe2.cardarchive.antwort.Antwort.AntwortType;

public class CardArchive implements ICardArchive {

	private final IAccountingRegistry accounting;
	
	public CardArchive(IAccountingRegistry inAccounting) {
		this.accounting = inAccounting;
	}
	
	@Override
	public Fach getFachByName(String inName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Fach> getFaecher() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fach createWithName(String inName) {
		return new Fach(inName);
	}

	@Override
	public Lernkarte<? extends Antwort> getLernkarteByID(UUID inID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Lernkarte<? extends Antwort>> getLernkarten() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Antwort createAntwort(AntwortType type) {
		// TODO Auto-generated method stub
		return null;
	}

}
