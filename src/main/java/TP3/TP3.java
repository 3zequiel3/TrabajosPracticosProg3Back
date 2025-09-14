package TP3;

import java.util.ArrayList;
import java.util.List;

public class TP3 {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();

        Producto p1 = new Producto("A001", "Mouse", 1500.0);
        Producto p2 = new Producto("A002", "Teclado", 3000.0);
        Producto p3 = new Producto("A001", "Mouse Gamer", 2500.0); // mismo código que p1
        Producto p4 = new Producto("A003", "Monitor", 25000.0);
        Producto p5 = new Producto("A002", "Teclado Mecánico", 5000.0); // mismo código que p2

        for (Producto p : new Producto[]{p1, p2, p3, p4, p5}) {
            if (!productos.contains(p)) {
                productos.add(p);
            }
        }

        System.out.println("Lista de productos sin duplicados por código:");
        for (Producto p : productos) {
            System.out.println(p);
        }
    }
}

