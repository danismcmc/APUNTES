package es.mdc;

public class Main {
    public static void main(String[] args) {
        try {
            boolean resultado = FUtil.existe("   "); // Cadena vacía o con espacios
            System.out.println("¿Existe el archivo? " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}

