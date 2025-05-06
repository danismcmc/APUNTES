import javax.swing.JOptionPane;

public class ejemplo_Helper {

	public ejemplo_Helper() {
		
	}

	public static void main(String[] args) {
		
		double resultado;
		resultado = Math.sqrt(16.0);
		System.out.println(resultado);
		
		System.out.println("numero e : " + Math.E);
		System.out.println("numero pi :" + Math.PI);
		
		// Lee un dato en una caja de dialogo grafico
		String cade = JOptionPane.showInputDialog("Teclea tu numero favorito: ");
		int numeroleido = Integer.parseInt(cade);
		
		// Mostrar el doble del numero leido
		JOptionPane.showMessageDialog(
				null,
				"El doble",
				"El doble es: " + (numeroleido * 2),
				JOptionPane.INFORMATION_MESSAGE);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
