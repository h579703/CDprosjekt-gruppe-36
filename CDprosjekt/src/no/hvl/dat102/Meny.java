package no.hvl.dat102;
import java.util.Scanner;

import no.hvl.dat102.adt.CDarkivADT;

public class Meny extends Fil{
	private Tekstgrensesnitt tekstgr;
	 private CDarkivADT cda;
	 
	 public Meny(CDarkivADT cda){
	 tekstgr = new Tekstgrensesnitt();
	 this.cda = cda;
	 }
	 
	 public void start() {
		 System.out.println("Arkivmeny:");
		 System.out.println("1: Opprette et nytt arkiv");
		 System.out.println("2: Velge eksisterende arkiv");
		 System.out.println("0: Avslutt");
	 }
	 
	 public CDarkivADT eksisterendeArkivMeny(String filnavn) {
			return lesFraFil(filnavn);
			
		} 
		 
	 public boolean startOperator() {
		 Scanner tastatur = new Scanner(System.in);
			int valg = tastatur.nextInt();
			 
			 
			 
			 switch(valg) {
			 	
			 	case 0:
			 		System.out.println("Avslutter...");
			 		break;
			 	case 1: 
			 		System.out.println("Skriv inn et nytt arkivnavn");
			 	case 2:
			 		eksisterendeArkivMeny();
			 		break;
			 	default:
			 		System.out.println("Ugyldig inntasting");
			 		
			 
			 
			 
			 }

			}
			
			
		}
		



