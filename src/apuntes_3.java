
public class apuntes_3 {

	public apuntes_3() {
		
	}

public static void main(String []args) {
		
		int num;
		
		//condicional multiple 
		//1. Tradicional: admite valores enteros
		
		num = 4;
		switch(num) {
		case 1: System.out.println("Enero");
			break;
			
		case 2: System.out.println("Febrero");
		break;
		
		case 4: System.out.println("Abril");
		break;
		
		case 5: System.out.println("Mayo");
		break;
		
		default:
			System.out.println("Es julio o posterior");
		}
		//2. Switch con case L -> labels
		//Solo admite valores enteros y 
		char letra = 'h';
		
		switch (letra) {
		case 'a', 'e', 'i', 'o', 'u' -> 
			{
				System.out.printf("%c es vocal%n", letra);
			}
		case 'b', 'c' -> 
			{
				System.out.printf("%c es b o c", letra);
			}
		case 'y', 'z' -> 
			{
				System.out.printf("%c es una de las últimas letras%n", letra);
			}
		default -> 
			{
			System.out.printf("No se que hace con la %c%n", letra );
			}
		}
		String palabra = "Hello";
		if (palabra !=null){
		switch (palabra) {
			case "Hello" ->
			{
				System.out.printf("%s es hola %n", palabra);
			}
			case "Apple" ->
			{
				System.out.printf("%s es Manzana %n", palabra);
			}
		}
	}
		//w. Switch con yield
		int mes = 4;
		int tempMedia = switch (mes) {
					case 1 -> 
					{
						yield 8;
					}
					case 4 -> 
					{
						yield 23;
					}
					default -> 
					{
						yield 20;
					}
			};
			System.out.printf("Para mes %d la temp. media es %dº %n", mes, tempMedia);
		}
	
}

		

