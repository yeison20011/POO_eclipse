package mundo;

public class autoMovil {
	private String placa;
	private int kilometraje;
	private int combustible;
	
	public autoMovil (String pl, int km, int comb) {
		this.placa = pl;
		this.kilometraje = km;
		this.combustible = comb;
	}
	
	public String getPlaca() {
		return (this.placa);
	}
	
	public int getKilometraje() {
		return (this.kilometraje);
	}
	
	public int getCombustible () {
		return (this.combustible);
	}
	
	public void setPlaca (String pl) {
		this.placa = pl;
	}
	
	public void setKilometraje (int km) {
		this.kilometraje = km;
	}
	
	public void setCombustible (int comb) {
		this.combustible = comb;
	}
	
	public String toString() {
		return("Placa: " + this.placa +" ___"+ " Kilometraje: " + this.kilometraje +" ___"+ " Combustible: " + this.combustible);
	}
	
	public void usoAuto (int km, int comb) {
		this.kilometraje = this.kilometraje + km;
		int x = km / 80;
		this.combustible = this.combustible - x;
	}
	
}
