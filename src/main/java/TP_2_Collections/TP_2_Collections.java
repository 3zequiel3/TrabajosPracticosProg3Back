// src/main/java/TP_2_Collections/TP_1_Collections.java
package TP_2_Collections;

import java.util.HashSet;
import java.util.Set;

public class TP_2_Collections {
    public static void main(String[] args) {
        Set<Producto> productos = new HashSet<>();
        productos.add(new Producto(1, "Leche"));
        productos.add(new Producto(2, "Pan"));
        productos.add(new Producto(1, "Leche Entera"));

        for (Producto p : productos) {
            System.out.println(p);
        }
    }
}
