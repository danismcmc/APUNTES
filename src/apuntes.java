import java.util.Scanner;

/**
 * Aplicación de ejemplo de codificación en Java
 * @author Dani
 * @version 1.1
 */
public class apuntes {

	/**
	 * Método main : punto de entrada de la aplicación.
	 * 
	 * @param args argumentos de la línea de órdenes (no usados)
	 */
	
	public static void main(String[] args) {
		
	

	

	           
	           //Constantes (no se pueden modificar, por eso se le pone final)
	            final int IVA = 21;
	            final double PI = 3.1416;
	        
	            //Tipos enteros

	            short varShort = 45;
	            int varEntera, numero=2; //Siempre en minuscula la variable
	            long varLong = 123;

	            //Tipo real

	            double  varReal = 10.67;

	            //Tipo caracter

	            char letraTecleada;
	            char inicialNombre = 'J';

	            //Tipo lógico
	            boolean esValido = true;
	            boolean esBisiesto;
	            
	            //OPERADORES:
	            // - Ariméticos		+,-,*,/, % (mod)
	            // - Relacionales	<,>,<=,>=,==, !=
	            // - Lógicos		and es &&, or es ||; not es !
	            
	            // INSTRUCIONES DE LA PROGRAMACIÓN ESTRUCTURADA
	            
	            
	            //Asignación (antes era la flecha <- ahora es el =)

	            
	            varEntera = 2;
	            varEntera = varEntera * (1+2);
	            esBisiesto = false;



	            //Escribir en consola

	            System.out.println("Esto es un ejemplo");
	            System.out.println("esBisiesto contiene:" + esBisiesto);
	            System.out.println("inicialNombre contiene:" + inicialNombre);
	            
	            System.out.println("Teclea un numero");
	            
	            //LEER por consola
	            
	           // 1) Necesito crear un objeto Scanner que se asocie al teclado
	            Scanner teclado = new Scanner(System.in);
	            //2) Ahora leo un valor entero de la consola
	            int num = teclado.nextInt();
	            System.out.println("Has tecleado un número");
	            //3) Cierro el "canal" con el teclado.
	            teclado.close();
	            
	            // CONDICIONAL SIMPLE
	            
	            if (num > 9) {
	            	System.out.println("El numero tecleado tiene más de una cifra");
	            }
	            
	            // CONDICIONAL DOBLE
	            
	            if (num % 2==0) {
	            	System.out.println("Es par");
	            }
	            else {
	            	System.out.println("Es impar");
	            }
	            
	            // REPETITIVA
	            
	           //cont <- 0
	            
	            //Mientras (num<=5)hacer
	            //Escribir hello world
	            //cont <- cont + 1
	            //finmientras
	            
	            int contador = 0;
	            while (contador < num) {
	            System.out.println("Hello world "+(contador+1));
	            contador++; //Veces = veces + 1
	            }
	            

	            /*
	            Si (numero mod 2=0) Entonces
	                Escribir "es par"
	            Sino 
	                Escribir "es impar"
	            FinSi
	            */
	            
	                if (numero % 2 == 0) {//Doble == es el operador de igualdad
	                System.out.println("2 es par");
	            }
	            else {
	                System.out.println("2 es impar");
	            }
	            
	            /*
	             En cmd poner primero javac ....(poner nombre del programa .class), 
	             mirar si tiene errores o no y luego poner java....(nombre del archivo.java)
	             */

	            // Final
	    }
	    
	}

	
