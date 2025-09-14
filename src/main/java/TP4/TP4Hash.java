package TP4;

import TP3.Producto;
import java.util.HashSet;
import java.util.Set;

public class TP4Hash {
    public static void main(String[] args) {
        Set<Producto> productos = new HashSet<>();

        Producto p1 = new Producto("A001", "Mouse", 1500.0);
        Producto p2 = new Producto("A002", "Teclado", 3000.0);
        Producto p3 = new Producto("A001", "Mouse Gamer", 2500.0); // mismo código que p1
        Producto p4 = new Producto("A003", "Monitor", 25000.0);
        Producto p5 = new Producto("A002", "Teclado Mecánico", 5000.0); // mismo código que p2

        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);

        System.out.println("Productos en HashSet (sin duplicados por código):");
        for (Producto p : productos) {
            System.out.println(p);
        }
    }
}

