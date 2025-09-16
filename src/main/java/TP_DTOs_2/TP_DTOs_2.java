package TP_DTOs_2;
import TP_DTOs_1.Producto;

import java.util.*;
public class TP_DTOs_2 {
    public static void main(String[] args) {
        System.out.println("Trabajo Practico 3 - DTOs Record");
        List<ProductoRecord> listaRecord = new ArrayList<>();
        Producto p1 = new Producto("001", "El Quijote", 29.99, "Miguel de Cervantes");
        Producto p2 = new Producto("002", "Cien Años de Soledad", 39.99, "Gabriel Garcia Marquez");
        Producto p3 = new Producto("003", "1984", 19.99, "George Orwell");
        Producto p4 = new Producto("004", "Matar a un Ruiseñor", 24.99, "Harper Lee");
        Producto p5 = new Producto("005", "El Gran Gatsby", 14.99, "F. Scott Fitzgerald");
        ProductoRecord p1DTO = new ProductoRecord(p1.getCodigo(), p1.getNombre(), p1.getPrecio(), p1.getAutor());
        ProductoRecord p2DTO = new ProductoRecord(p2.getCodigo(), p2.getNombre(), p2.getPrecio(), p2.getAutor());
        ProductoRecord p3DTO = new ProductoRecord(p3.getCodigo(), p3.getNombre(), p3.getPrecio(), p3.getAutor());
        ProductoRecord p4DTO = new ProductoRecord(p4.getCodigo(), p4.getNombre(), p4.getPrecio(), p4.getAutor());
        ProductoRecord p5DTO = new ProductoRecord(p5.getCodigo(), p5.getNombre(), p5.getPrecio(), p5.getAutor());
        listaRecord.add(p1DTO);
        listaRecord.add(p2DTO);
        listaRecord.add(p3DTO);
        listaRecord.add(p4DTO);
        listaRecord.add(p5DTO);

        for(ProductoRecord p : listaRecord){
            System.out.println(p);
        }
    }
}
