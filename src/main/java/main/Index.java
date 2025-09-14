package main;

import TP_1_Collections.TP_1_Collections;

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
            case "4":
                TP4.TP4Hash.main(new String[]{});
                break;
            case "5":
                TP_1_Collections.main(new String[]{});
                break;
            case "6":
                TP_2_Collections.TP_2_Collections.main(new String[]{});
                break;
            case "7":
                TP_3_Collections.TP_3_Collections.main(new String[]{});
                break;
            case "8":
                TP_Loombok_1.TP_Loombok_1.main(new String[]{});
                break;
            default:
                System.out.println("TP_SELECT inválido: " + seleccion);
        }
    }
}
