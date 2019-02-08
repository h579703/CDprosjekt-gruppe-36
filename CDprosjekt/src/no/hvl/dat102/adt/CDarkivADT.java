package no.hvl.dat102.adt;

import no.hvl.dat102.CD;
import no.hvl.dat102.Sjanger;

public interface CDarkivADT {
	
	void utvidKapasitet();
	
	
	CD[] hentCdTabell();
	
	boolean slettCd(int cdNr);
	
	void leggTilCd(CD nyCd);
	
	CD[] sokTittel(String delstreng);
	
	CD[] sokArtist(String delstreng);
	
	int antallSjanger(Sjanger sjanger);
	
	int antall();
	
	CD[] trimTab(CD[] tab, int n);
}
