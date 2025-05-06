public class apuntes_4 {
	//METODOS
			//-Un metodo realiza una sola tarea
			//-Se puede utilizar en diferentes lugares o aplicaciones (public)

			
			//1)Escribir un metodo que escriba en pantalla el valor en mayusculas de una letra dada
			
			// Utiliza la clase Character de java
			
			//2)Escribir un metodo que escriba en pantalla el valor en minusculas de una letra dada
			
			//3)Escribir un metodo que escriba en pantalla una serie de numeros desde el primero al ultimo dados por parametros
			//  Ejemplo:5,10 -> Escribe 5,6,7,8,9,10
			
			//4)Escribe una app (con main) para probarlos. Hará varias llamadas a cada uno
	
			//5)Escribe un metodo que dado un numero, escrbia en pantalla su valor hexadecimal, solo si es positivo
	
	//1) 
	public static void escribeMayuscula(char letra) {
		System.out.println(Character.toUpperCase(letra));
	}
	
	//2)
	public static void escribeMinuscula(char letra) {
		System.out.println(Character.toLowerCase(letra));
	}
	
	//3)
	public static void serieNumeros() {
		int num = 5;
		while (num <= 10) {
			System.out.println(num);
			num++;
		}
	}
	
	//5)
	public static void imprimirHexadecimal(int numero) {
		if (numero > 0) {
            String hexadecimal = Integer.toHexString(numero);
            System.out.println("El valor hexadecimal es: " + hexadecimal);
        } else {
            System.out.println("El número no es positivo.");
        }
    }
	
	public apuntes_4() {}
	
	
	//4)
	public static void main(String []args) {
		
		//1) 
		apuntes_4.escribeMayuscula('a');
		apuntes_4.escribeMayuscula('z');
		
		//2)
		apuntes_4.escribeMinuscula('A');
		apuntes_4.escribeMinuscula('Z');
		
		//3)
		apuntes_4.serieNumeros();
		
		//5)
		apuntes_4.imprimirHexadecimal(45);   
		apuntes_4.imprimirHexadecimal(500); 
}
}