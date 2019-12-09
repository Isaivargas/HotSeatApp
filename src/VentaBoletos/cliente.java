package VentaBoletos;

public class cliente {

	private String nombre;
	private String rfc;
	private int    telefono;
	private String email;
	private String numTarjeta;
    private String tipoCliente;
	
	public cliente (String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getRfc() {
		return rfc;
	}
	
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	
	public int getTelefono() {
		return telefono;
	}
	
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNumTarjeta() {
		return numTarjeta;
	}
	
	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}
	

	
	
}
