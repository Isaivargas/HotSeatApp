package VentaBoletos;

import java.util.ArrayList;

public class sala {
	
	private String tipoSala;
	private int numSala;
	pelicula peli;
	ArrayList<asiento> asientos = new ArrayList<asiento>();
	
	public sala(String tipoSala,int numSala,pelicula peli) {
		this.tipoSala = tipoSala;
		this.numSala = numSala; 
		this.peli = peli;
	}
	
	public String getTipoSala() {
		return tipoSala;
	}

	public int getNumSala() {
		return numSala;
	}

	

	
	
	

}
