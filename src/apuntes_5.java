import java.util.Scanner;

public class apuntes_5 {

	public apuntes_5() {
		
	}

	// Metodos que "Calculan"
	
	public static int calcularDoble(int numero){
		int result = numero * 2;
		return result; //se utiliza en un metodo para resolver el valor
	}
	
	
	// Metodos que "Escriben"
	// REALIZADO EN APUNTES_4 "pintaLinea"
	
	
	// Metodos que "Leen"
	// EJEMPLO: Metodo que lee un valor y comprueba que esta en un rango
	
	public static int leerYValidarRango(int inf, int sup) {
		int valor;
		Scanner teclado = new Scanner(System.in);
		do {
			// Leer numero
			valor = teclado.nextInt();
		}while(valor<inf || valor>sup);
		teclado.close();
		
		return valor;
	}
	
	public static void main(String []args) {
		// EL QUE CALCULA
		int rdo = calcularDoble(7) + calcularDoble(100);
		System.out.println(rdo);
		
		// EL QUE LEE
		int valor = leerYValidarRango(1,10);
		System.out.println("Correcto, has tecleado " + valor);
		
	}
}
