package es.mdc; 
import java.io.File; 


/**
 * Verifica si un archivo existe a partir del nombre de archivo proporcionado.
 *
 * @param filename el nombre del archivo a verificar. No debe ser null ni estar vacío.
 * @return true si el archivo existe, false en caso contrario.
 * @throws IllegalArgumentException si el nombre del archivo es null, vacío o contiene solo espacios en blanco.
 * @author Dani Sanchez
 */

public class FUtil {
	
	    public static boolean existe(String filename) throws IllegalArgumentException {
	    
	        if (filename == null || filename.trim().isEmpty()) {
	            throw new IllegalArgumentException("El nombre del archivo no puede estar vacío o contener solo espacios");
	        }

	        File file = new File(filename);
	        return file.exists();

}
}	
