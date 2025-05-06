
public class apuntes_2 {

	public apuntes_2() {
		
	}

	public static void main(String[] args) {
		
		/**PrintStream es una clase para crear objetos, out es el objeto de printstream ya creado en la clase system**/
		
		System.out.println("Escribo un linea"); //con este salto de linea y sin ln no
		
		System.out.print("Hello");
		System.out.print("world");
		
		System.out.println("");
		
		
		// %d es entero, %s es texto, %n es cambio de linea, %f numero real
		
		int num = 7;
		String numBin = Integer.toBinaryString(num);
		
		String texto = "Programacion java";
		double mitadPi = Math.PI / 2;
		
		//"Num contine -- y texto contiene --"
		System.out.printf("Num contine %d y texto contiene %s %n",num ,texto);
		
		
		//"Num contiene --, (en binario --) y PI es ---"
		System.out.printf("Num contiene %d, (en binario %s) %n", num, numBin);
		
		
		//Para dos decimales %.2f
		System.out.printf("PI vale %.2f %nLa mitad de PI es %f %n", Math.PI, mitadPi);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
