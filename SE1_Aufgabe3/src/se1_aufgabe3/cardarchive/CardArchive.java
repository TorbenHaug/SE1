package se1_aufgabe3.cardarchive;

import java.util.Collection;
import java.util.UUID;

import se1_aufgabe3.accounting.IAccountingRegistry;
import se1_aufgabe3.cardarchive.antwort.IAntwort;
import se1_aufgabe3.cardarchive.antwort.Antwort;

public class CardArchive implements ICardArchive {

	private final IAccountingRegistry accounting;
	
	public CardArchive(IAccountingRegistry inAccounting) {
		this.accounting = inAccounting;
	}
	
	@Override
	public IFach getFachByName(String inName) {
		return null;
	}

	@Override
	public Collection<IFach> getFaecher() {
		return null;
	}

	@Override
	public IFach createWithName(String inName) {
		return new Fach(inName);
	}

	@Override
	public ILernkarte<? extends IAntwort> getLernkarteByID(UUID inID) {
		return null;
	}

	@Override
	public Collection<ILernkarte<? extends IAntwort>> getLernkarten() {
		return null;
	}

	@Override
	public IAntwort createAntwort(Antwort.AntwortType type) {
		return null;
	}

}
