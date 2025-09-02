package main;

public class Index {
    public static void main(String[] args) {
        // Leer variable de entorno TP_SELECT
        String seleccion = System.getenv("TP_SELECT");
        System.out.println("Valor recibido de TP_SELECT: '" + seleccion + "'");
        if (seleccion == null) {
            System.out.println("No se definió TP_SELECT en el entorno. Saliendo...");
            return;
        }
        switch (seleccion.trim()) {
            case "1":
                TP1.TP1.main(new String[]{});
                break;
            case "2":
                TP2.TP2.main(new String[]{});
                break;
            case "3":
                TP3.TP3.main(new String[]{});
                break;
            default:
                System.out.println("TP_SELECT inválido: " + seleccion);
        }
    }
}
