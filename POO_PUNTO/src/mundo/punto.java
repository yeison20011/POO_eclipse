package mundo;
import java.math.*;

public class punto {
	private double x;
	private double y;
	
	public punto() {
		this.x = 0;
		this.y = 0;
	}
	
	//Sobre carga, con muchos constructores
	
	public punto (double vx, double vy) {  
		this.x = vx;
		this.y = vy;
	}
	
	public double getX () {
		return (this.x);
	}
	
	public double getY () {
		return (this.y);
	}
	
	public void setX(double vx) {
		this.x = vx;
	}
	
	public void setY (double vy) {
		this.y = vy;
	}
	
	public String toString () {
		return ("p " + (this.x + this.y));
	}
	
	public double distancia (punto p) {
		
		double rx = p.getX() - this.x;  //p es el objeto dos, y this es el objeto propio de la clase.
		double ry = p.getY() - this.y;
	
		rx = Math.pow(rx, 2); //potencia
		ry = Math.pow(ry, 2);
	
		double suma = rx + ry;
	
		double distan = Math.sqrt(suma);
	
		return (distan);
	
	
	
	
	}
}

