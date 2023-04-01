package mundo;

public class Persona {
	//Atributos de la clase, del objeto
	private int documento;
	private String nombre;
	private int edad;
	
	public Persona (int doc, String nom, int ed) {
		this.documento = doc;
		this.nombre = nom;
		this.edad = ed;
	}
	
	public int getDocumento () {
		return (this.documento);
	}
	
	public String getNombre () {
		return (this.nombre);
	}
	
	public int getEdad () {
		return (this.edad);
	}
	
	public void setDocumento (int doc) {
		this.documento = doc;
	}
	
	public void setNombre (String nom) {
		this.nombre = nom;
	}
	
	public void setEdad (int ed) {
		this.edad = ed;
	}
	
	public void cumpleaños () {
		this.edad = edad + 1;
	}
	
	public String toString () {
		String rta = "";
		
		rta = "Documento: " + this.documento + " ___";
		rta = rta + " Nombre: " + this.nombre + " ___";
		rta = rta + " Edad: " + this.edad;
		
		return (rta);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
