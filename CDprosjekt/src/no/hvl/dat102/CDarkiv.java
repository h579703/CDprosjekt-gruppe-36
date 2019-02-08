package no.hvl.dat102;
import no.hvl.dat102.adt.CDarkivADT;


public class CDarkiv implements CDarkivADT {
	private CD[] cdTabell;
	private int antall;
	
	
	public CDarkiv(int n) {
		cdTabell = new CD[n];
		antall = 0;
	}
	

	@Override
	public CD[] hentCdTabell() {
		return cdTabell;
		
		
	}
	
	@Override
	public boolean slettCd(int cdnr) {
		boolean slett = false;
		for(int i = 0; i < cdTabell.length; i++) {
			if (cdTabell[i].getCdnr() == cdnr) {
				cdTabell[cdnr] = null;
				slett = true;
			}
		}
		return slett;
	
		
	}
	
	@Override
	public void utvidKapasitet() { 
		CD[] hjelpetabell = new CD [(int)Math.ceil(1.1 * cdTabell.length)];
			for (int i = 0; i < cdTabell.length; i++) {
				hjelpetabell[i] = cdTabell[i]; 
			}
			cdTabell = hjelpetabell;
	}
		
	@Override
	public void leggTilCd(CD nyCd) {
		if (antall == cdTabell.length) {
			utvidKapasitet();
		}
		cdTabell[antall] = nyCd;
		antall ++;

	}
	
	@Override
	public CD[] trimTab(CD[] tab, int n) { // n er antall elementer
		 CD[] cdtab = new CD[n];
		 int i = 0;
		 while (i < n) {
		cdtab[i] = tab[i];
		i++;
		 }//while
		 return cdtab;
		}//
	

	@Override
	public CD[] sokTittel(String delstreng) {
		//Koder senere
		CD[] cdtab = new CD[antall()];
		int ant = 0;
		for(int i = 0; i < ant; i++) {
			if(cdTabell[i].getTittel().indexOf(delstreng) >= 0) {
				cdtab[i]=cdTabell[i];
				ant++;
			}
		
		}
		return (trimTab(cdtab,ant));
	}
	
	@Override
	public CD[] sokArtist(String delstreng) {
		CD[] cdtab2 = new CD[antall()];
		int ant = 0;
		for(int i = 0; i < ant; i++) {
			if(cdTabell[i].getArtist().indexOf(delstreng) >= 0) {
				cdtab2[i]=cdTabell[i];
				ant++;
			}
		
		}
		return (trimTab(cdtab2,ant));
	}
	
		
	
	@Override
	public int antallSjanger(Sjanger sjanger) {
		int antallSjanger = 0;
			for (int i = 0; i < antall; i++) {
				if (cdTabell[i].getSjanger() == sjanger) {
					antallSjanger++;
			}
		}
		return antallSjanger;
}
	@Override
	public int antall() {
		int counter = 0;
		for(int i = 0; i < cdTabell.length; i++) {
			if (cdTabell[i] != null) {
				counter ++;
			}
		}
		return counter;
		
	}
		
	}
	
	
