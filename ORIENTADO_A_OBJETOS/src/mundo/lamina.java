package mundo;
import java.util.Arrays;

public class lamina {
	private boolean[] album;
	private int numeroLamina;
	private int[] repetidas;
	private boolean esRepetida;
	
	public lamina (int numLamina) {
		this.album = new boolean[250];
		Arrays.fill(album, false);
		this.numeroLamina = numLamina;
		this.repetidas = new int [250];
		this.esRepetida = false;
	}
	
	public boolean[] getAlbum () {
		return (this.album);
	}
	
	public int getNumeroLamina () {
		return (this.numeroLamina);
	}

	public int[] getRepetidas () {
		return (this.repetidas);
	}
	
	public boolean getEsRepetida () {
		return (this.esRepetida);
	}
	
	public void setAlbum (boolean[] album) {
		this.album = album;
	}
	
	public void setNumeroLamina (int x) {
		this.numeroLamina = x;
	}
	
	public void setRepetidas (int [] repetidas) {
		this.repetidas = repetidas;
	}
	
	public void setEsRepetida (boolean x) {
		this.esRepetida = x;
	}
	
	public void addRepetidas (int x) {
		int array[] = this.repetidas;
		
		for (int contador = 0; contador < array.length; contador ++) {
			if (contador == (x - 1)) {
				array[contador] = array[contador] + 1;
			}
		}
	}
	
	public void addLamina (int x) {
		boolean array[] = this.album;
		
		for (int contador = 0; contador < array.length; contador ++) {
			if (contador == (x - 1)) {
				array[contador] = true;
			}
		}
	}
	
	public String recorrerAlbum () {
		boolean x[] = this.album;
		int acumulador = 0;
		String posi = "";
		
		for (int contador = 0; contador < x.length; contador++) {
			if (x[contador] == false) {
				acumulador ++;
				posi = posi + "Posición: " + (contador + 1) + "\n  ";
			}
		}
		return ("Listado de espacios disponibles: " + posi);
	}
	
	public int recorrerAlbumAux () {
		boolean x[] = this.album;
		int acumulador = 0;
		
		for (int contador = 0; contador < x.length; contador++) {
			if (x[contador] == false) {
				acumulador ++;
			}
		}
		return (acumulador);
	}
	
	public boolean ctrlLaminas (int x) { //comprobar si está repetida la lámina
		boolean array[] = this.album;
		
		for (int contador = 0; contador < array.length; contador ++) {
			if (array[contador] == true) {
				if (contador == (x - 1)) {
					return (true);
				}
			}
		}
		return (false);
	}
	
	public String toString () {
		int x = recorrerAlbumAux();
		return ("Album: " + this.album + "\n Repetidas: " + this.repetidas + "\n Faltantes: " + x);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
