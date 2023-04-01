package mundo;

public class estudiante {
	private int documento;
	private String nombre;
	private double examen_1, examen_2, examen_3;
	private double quices_1, quices_2;
	private double proyectoFinal;
	
	public estudiante(int doc, String nom) {
		this.documento = doc;
		this.nombre = nom;
		this.examen_1 = 0;
		this.examen_2 = 0;
		this.examen_3 = 0;
		this.quices_1 = 0;
		this.quices_2 = 0;
		this.proyectoFinal = 0;
	}
	
	public int getDocumento() {
		return (this.documento);
	}
	
	public String getNombre() {
		return (this.nombre);
	}
	
	public double getExamen_1() {
		return (this.examen_1);
	}
	
	public double getExamen_2() {
		return (this.examen_2);
	}
	
	public double getExamen_3() {
		return (this.examen_3);
	}
	
	public double getQuices_1() {
		return (this.quices_1);
	}
	
	public double getQuices_2() {
		return (this.quices_2);
	}
	
	public double getProyectoFinal() {
		return (this.proyectoFinal);
	}
	
	public void setDocumento (int doc) {
		this.documento = doc;
	}
	
	public void setNombre (String nom) {
		this.nombre = nom;
	}
	
	public String toString () {
		return ("Documento: "+this.documento + "___"+ " Nombre: "+this.nombre+ "___"+ " Examen 1: "+ this.examen_1+ " Examen 2: "+this.examen_2+ " Examen 3"+this.examen_3+ " Quices 1: "+this.quices_1+ " Quices 2: "+this.quices_2+ " Proyecto final: "+this.proyectoFinal);
	}
	
	public void asigPrimero (double ex1, double quiz1) {
		this.examen_1 = ex1;
		this.quices_1 = quiz1;
	}
	
	public void asigSegundo (double ex2, double quiz2) {
		this.examen_2 = ex2;
		this.quices_2 = quiz2;
	}
	
	public String proyecFinal (double ex3) {
		double fal, rta = 0.0;
		
		fal = (this.examen_1 * 0.2) + (this.examen_2 * 0.2) + (ex3 * 0.2) + (this.quices_1 * 0.1) + (this.quices_2 * 0.1);
		rta = (3.0 - fal) / 0.2;
		
		if (fal >= 3.0) {
			return ("El estudiante ya pasó la materia.");
		}
		return ("Lo que necesita el estudiante en el proyecto final para pasar la materia es: " + rta);
	}
}
