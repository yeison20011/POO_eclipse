package mundo;

public class temperatura {
	private double centigrados;
	private double farenheit;
	private double kelvin;
	
	public temperatura () {
		this.centigrados = 0;
		this.farenheit = 0;
		this.kelvin = 0;
		
	}
	
	public double getCentigrados () {
		return (this.centigrados);
	}
	
	public double getFarenheit () {
		return (this.farenheit);
	}
	
	public double getKelvin () {
		return (this.kelvin);
	}
	
	public void setCentigrados (double x) {
		this.centigrados = x;
	}
	
	public void setFarenheit (double x) {
		this.farenheit = x;
	}
	
	public void setKelvin (double x) {
		this.kelvin = x;
	}
	
	public void calCenAfarenheit () {
		this.farenheit = (this.centigrados * (9.0/5.0) + 32);
	}
	public void calFarenheitAcen () {
		this.centigrados = ((this.farenheit - 32) * (5.0/9.0));
	}
	
	public void calcenAkalvin () {
		this.kelvin = (this.centigrados + 273.15);
	}
	
	public void calKelAcen () {
		this.centigrados = (this.kelvin - 273.15);
	}
	
	public String toString () {
		return ("Centigrados: " + this.centigrados + "___" + "Farenheit: " + this.farenheit + "___" + "Kelvin: " + this.kelvin);
	}
}
