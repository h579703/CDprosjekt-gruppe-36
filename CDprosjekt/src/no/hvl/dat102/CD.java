package no.hvl.dat102;
import no.hvl.dat102.Sjanger;

public class CD {
	private int cdnr;
	private String artist;
	private String tittel;
	private int lansering;
	private Sjanger sjanger;
	private String plateselskap;
	
	public CD() {
		CD cd = new CD();
	}
	
	public CD(int cdnr, String artist, String tittel, int lansering, Sjanger sjanger, String plateselskap) {
		this.cdnr = cdnr;
		this.artist = artist;
		this.tittel = tittel;
		this.lansering = lansering;
		this.sjanger = sjanger;
		this.plateselskap = plateselskap;
	}
	
	public void setCdnr(int cdnr) {
		this.cdnr = cdnr;
	}
	
	public int getCdnr() {
		return cdnr;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void setTittel(String tittel) {
		this.tittel = tittel;
	}
	
	public String getTittel() {
		return tittel;
	}
	
	public void setLansering(int lansering) {
		this.lansering = lansering;
	}
	
	public int getLansering() {
		return lansering;
	}
	
	public void setSjanger(Sjanger sjanger) {
		this.sjanger = sjanger;
	}
	
	public Sjanger getSjanger() {
		return sjanger;
	}
	
	public void setPlateselskap(String plateselskap) {
		this.plateselskap = plateselskap;
	}
	
	public String getPlateselskap() {
		return plateselskap;
	}
	

}
