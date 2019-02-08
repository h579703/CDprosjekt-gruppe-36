package no.hvl.dat102;
import no.hvl.dat102.adt.CDarkivADT;

public class CDarkiv2<T> implements CDarkivADT {
	private LinearNode<T> start;
	private int antall;

	public CDarkiv2() {
		start = null;
		antall = 0;
	}
	
	public boolean slettCd(T cdNr) {
		
		boolean slett = false;
		
		T svar = null;
		if (antall>0) {
			svar = start.getElement();
			start = start.getNeste();
			antall--;
			slett = true;
		}
		return slett;
	}
	

	public void leggTilCd (T nyCd) {
		
		LinearNode<T> nynode = new LinearNode<T>(nyCd);
		nynode.setNeste(start);
		start = nynode;
		antall++;
		
	}
	
	@Override
	public int antall() {
		return antall;
	}
	

	

}