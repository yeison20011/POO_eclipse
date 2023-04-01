package mundo;

public class cafeteria {
	private int vasos;
	private int cucharadas;
	private int venta;

	
	public cafeteria (int x) {
		this.vasos = 80;
		this.cucharadas = x;
		this.venta = 0;
	}
	
	public int getVenta () {
		return (this.venta);
	}
	
	public int getVasos () {
		return (this.vasos);
	}
	
	public int getCucharadas () {
		return (this.cucharadas);
	}
	
	public void setVenta (int x) {
		this.venta = x;
	}
	
	public void setVasos (int x) {
		this.vasos = x;
	}
	
	public void setCucharadas (int x) {
		this.cucharadas = x;
	}

	
	public Boolean inventarioVasos () {
		if (this.vasos <=  80 && this.vasos >= 1) {
			return (true);
		} else {
			return (false);
		}
	}
	
	public Boolean inventarioAzucar(int azu) {
		if (this.cucharadas < azu) {
			return (true);
		} else {
			return (false);
		}
	}
	
	public void calConAzucar (int vas, int azu) {
	    boolean inv = inventarioVasos();
	    boolean inv2 = inventarioAzucar(azu);
	    int ven = 0;
	    
	    if (inv == true && inv2 == true) {
	    	this.venta = (vas * 500) + (300 * vas);
	    	this.vasos = this.vasos - vas;
	    	this.cucharadas = this.cucharadas - (vasos * 2);
	    }
	}
	
	public void calSinAzucar (int vas) {
		boolean inv = inventarioVasos();
		int ven = 0;
		
		if (inv == true) {
			this.venta = (vas * 500);
			this.vasos = this.vasos - vas;
		} 
	}
	
	public String toString(int azu) {
		return ("Vasos: " + (80 - this.vasos) + "___" + "Azucar: " + (azu - this.cucharadas));
	}
	
	
	
	
}
