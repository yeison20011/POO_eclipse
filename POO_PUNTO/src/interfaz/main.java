package interfaz;
import mundo.punto;

public class main {
	public static void main (String[] args) {
		
		/*
		punto p1 = new punto (6,2);
		punto p2 = new punto (5,3);
		punto p3 = new punto (5,9);
		punto p4 = new punto (3,1);
		punto p5 = new punto (0,3);
		
		double rta1 = p1.distancia(p2);
		double rta2 = p1.distancia(p3);
		double rta3 = p1.distancia(p4);
		double rta4 = p1.distancia(p5);
		
		double rtaa1 = p2.distancia(p3);
		double rtaa2 = p2.distancia(p4);
		double rtaa3 = p2.distancia(p5);
		
		double rt1 = p3.distancia(p4);
		double rt2 = p3.distancia(p5);
		
		double ta1 = p4.distancia(p5);
		
		System.out.println("La distancia entre "+ p1.toString() + " y "+ p2.toString()+ " es: "+ rta1 );
		System.out.println("La distancia entre "+ p1.toString() + " y "+ p3.toString()+ " es: "+ rta2 );
		System.out.println("La distancia entre "+ p1.toString() + " y "+ p4.toString()+ " es: "+ rta3 );
		System.out.println("La distancia entre "+ p1.toString() + " y "+ p5.toString()+ " es: "+ rta4 );
		
		System.out.println("");
		
		System.out.println("La distancia entre "+ p2.toString() + " y "+ p3.toString()+ " es: "+ rtaa1 );
		System.out.println("La distancia entre "+ p2.toString() + " y "+ p4.toString()+ " es: "+ rtaa2 );
		System.out.println("La distancia entre "+ p2.toString() + " y "+ p5.toString()+ " es: "+ rtaa3 );
		
		System.out.println("");
		
		System.out.println("La distancia entre "+ p3.toString() + " y "+ p4.toString()+ " es: "+ rt1 );
		System.out.println("La distancia entre "+ p3.toString() + " y "+ p5.toString()+ " es: "+ rt2 );
		
		System.out.println("");
		
		System.out.println("La distancia entre "+ p4.toString() + " y "+ p5.toString()+ " es: "+ ta1 );
		*/
		
		
		
		punto pto [] = new punto[10];
		
		double vx, vy = 0.0;
		
		for (int contador = 0; contador < pto.length; contador ++) {
			vx = (Math.random() * 50) + 1;
			vy = (Math.random() * 50) + 1;
			
			pto[contador] = new punto (vx,vy);
		}
		
		
		for (int i = 0; i < pto.length - 1; i ++) {
			for (int j = i + 1; j < pto.length; j ++) {
				double rta = pto[i].distancia(pto[j]);
				System.out.println("La distancia entre "+ pto[i].toString() + " y "+ pto[j].toString()+ " es: "+ rta );
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
