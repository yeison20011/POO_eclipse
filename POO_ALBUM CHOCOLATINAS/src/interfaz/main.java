package interfaz;
import mundo.lamina;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		lamina lam1 = new lamina (251);
		int op = 0;
		int condicion = 0;
		int numLamina = 0;
		boolean rta;
		
		while (condicion == 0) {
		
		System.out.println("      M_U_N_D_O___N_A_T_U_R_A_L        ");
		System.out.println("");
		System.out.println("1) Listado de laminas que no se tienen");
		System.out.println("2) Agregar lamina");
		System.out.println("3) Determinar si se tiene lamina repetida");
		System.out.println("4) Resumen del album");
		System.out.println("5) Salir");
		System.out.println("");
		System.out.println("Seleccione una opcion: ");
		System.out.println("");
		
		op = sc.nextInt();
		
		switch (op) {
			case 1:
				System.out.println(lam1.recorrerAlbum());
				System.out.println("");
				break;
				
			case 2:
				System.out.println("Ingrese el numero de lámina que desea agregar al album: ");
				numLamina = sc.nextInt();
				rta = lam1.ctrlLaminas(numLamina);
				if (rta  == true) {
					lam1.addRepetidas(numLamina);
				} else {
					lam1.addLamina(numLamina);
				}
				System.out.println("");
				break;
				
			case 3: 
				System.out.println("Ingrese el numero de lámina que desea agregar al album: ");
				numLamina = sc.nextInt();
				rta = lam1.ctrlLaminas(numLamina);
				if (rta = true) {
					System.out.println("¡Está repetida!");
				} else {
					System.out.println("¡No está repetida!");
				}
				System.out.println("");
				break;
				
			case 4:
				System.out.println(lam1.toString());
				System.out.println("");
				break;
				
			case 5:
				System.out.println("Has salido.");
				condicion = 1;
				break;
		}
		
		}	
	}
}