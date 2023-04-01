package mundo;

public class triangulo {
	private double area, base, altura;
	
	public triangulo () {
		this.area = 0;
		this.base = 0;
		this.altura = 0;
	}
	
	public double getArea () {
		return (this.area);
	}
	
	public double getBase () {
		return (this.base);
	}
	
	public double getAltura () {
		return (this.altura);
	}
	
	public void setArea (double x) {
		this.area = x;
	}
	
	public void setBase (double x) {
		this.base = x;
	}
	
	public void setAltura (double x) {
		this.altura = x;
	}
	
	public void calArea () {
		this.area = (this.base * this.altura) / 2; 
	}
	
	public void calBase () {
		this.base = (this.area * 2) / this.altura;
	}
	
	public void calAltura () {
		this.altura = (this.area * 2) / this.base;
	}
	
	public String toString () {
		String rta = "";
		
		rta = "Area: " + this.area + "___" + "Base: " + this.base + "___" + "Altura: " + this.altura;
		
		return (rta);
	}
}
