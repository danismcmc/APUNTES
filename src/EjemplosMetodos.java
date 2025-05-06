import java.util.Scanner;

public class EjemplosMetodos {
	
	//Subprograma o Metodo que pinta una linea con '*'
	
	//visibilidad [static] tipo_devuelto nombre_metodo [parametros]
	// la puedo hacer mas flexible añadiendo en el metodo por ejemplo char simbolo y 
	// dentro de printf poner simbolo en vez de *
	
	public static void pintaLinea(int cantidad) {
		
		//Pintar linea de N asteriscos
		for (int i=0;i<cantidad;i++) {
			System.out.printf("*");
		}
		System.out.printf("%n");
	}

	public EjemplosMetodos() {}

	
	public static void main(String[] args) {
		//Leer N
		Scanner teclado = new Scanner(System.in);
		System.out.println("Teclea un numero: ");
		int num = teclado.nextInt();
		teclado.close();
		
		//Pintar linea de N asteriscos
		EjemplosMetodos.pintaLinea(num);
		
		//Pintar linea con el doble de asteriscos
		EjemplosMetodos.pintaLinea(num * 2);
		
		//AHORA QUIERO PINTAR UN CUADRADO RELLENO (NxN lineas)
		for (int i = 0; i < num; i++) {
			pintaLinea(num);
		}
		
		
		
		

}
}
