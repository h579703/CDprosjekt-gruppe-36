package no.hvl.dat102;
import java.io.*;
import java.util.Scanner;
import no.hvl.dat102.CD;
import no.hvl.dat102.CDarkiv;

import no.hvl.dat102.adt.CDarkivADT;

public class Tekstgrensesnitt extends CDarkiv{

	public CD lesCD() {
		Scanner tastatur = new Scanner(System.in);
		System.out.print("Skriv inn et cd-nummer");
		int cdnr = tastatur.nextInt();
		tastatur.nextLine();
		System.out.print("Skriv inn en artist");
		String artist = tastatur.nextLine();
		System.out.print("Skriv inn en tittel");
		String tittel = tastatur.nextLine();
		System.out.print("Skriv inn et plateselskap");
		String plateselskap = tastatur.nextLine();
		System.out.print("Skriv inn en lanseringsdato");
		int lansering = tastatur.nextInt();
		tastatur.nextLine();
		System.out.print("Skriv inn en sjanger");
		String sjStr = tastatur.nextLine();
		Sjanger sj = Sjanger.finnSjanger(sjStr);
		
		return(new CD(cdnr, artist, tittel, lansering, sj, plateselskap));
		
	
		
		
	}
	
	public void visCD(CD cd) {
		System.out.printf("%3d", cd.getCdnr());
		System.out.printf("%3s", cd.getArtist());
		System.out.printf("%3s", cd.getTittel());
		System.out.printf("%3d", cd.getLansering());
		System.out.printf("%3d", cd.getSjanger());
		System.out.printf("%3s", cd.getPlateselskap());
		//vise en cd med alle opplysningene på skjerm
		
	}
	
	public void skrivUtCdDelstrengITittel(CDarkivADT cda, String delstreng) {
		
		Scanner tast = new Scanner(System.in);
		String input = tast.nextLine();
		
		
               System.out.println(sokTittel(input));
               tast.close();
         }
       
   
	
	public void skrivUtCdArtist(CDarkivADT cda, String delstreng) {
		Scanner tast = new Scanner(System.in);
		String input = tast.nextLine();
		
		System.out.println(sokArtist(input));
		tast.close();
		
	}
	
	public void skrivUtStatistikk(CDarkivADT cda) {
	
		String ut = "Antall CDer i de ulike kategoriene er: ";
		System.out.println("Det er " + cda.antall() + "CDer totalt.");
		System.out.println(ut);
		
		System.out.println(cda.antallSjanger(Sjanger.ROCK));
		System.out.println(cda.antallSjanger(Sjanger.POP));
		System.out.println(cda.antallSjanger(Sjanger.OPERA));
		System.out.println(cda.antallSjanger(Sjanger.JAZZ));
		System.out.println(cda.antallSjanger(Sjanger.KLASSISK));
		
		
		
	}

}
