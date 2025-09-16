package TP_DTOs_1;

import java.util.*;
import java.util.stream.Collectors;
public class TP_DTOs_1 {
    public static void main(String[] args) {
        List<ProductoDTO> listaProductoDTO = new ArrayList<>();
        System.out.println("Trabajo Práctico 2 - DTOs Clasicos");


        Producto producto1 = new Producto("1", "El Quijote", 1500.0, "Miguel de Cervantes");
        Producto producto2 = new Producto("2", "1984", 1200.0, "George Orwell");
        Producto producto3 = new Producto("3", "Cien Años de Soledad", 1800.0, "Gabriel García Márquez");
        Producto producto4 = new Producto("4", "El Principito", 800.0, "Antoine de Saint-Exupéry");
        Producto producto5 = new Producto("5", "La Sombra del Viento", 1300.0, "Carlos Ruiz Zafón");


        ProductoDTO dto1 = new ProductoDTO(producto1.getNombre(), producto1.getPrecio());
        ProductoDTO dto2 = new ProductoDTO(producto2.getNombre(), producto2.getPrecio());
        ProductoDTO dto3 = new ProductoDTO(producto3.getNombre(), producto3.getPrecio());
        ProductoDTO dto4 = new ProductoDTO(producto4.getNombre(), producto4.getPrecio());
        ProductoDTO dto5 = new ProductoDTO(producto5.getNombre(), producto5.getPrecio());
        listaProductoDTO.add(dto1);
        listaProductoDTO.add(dto2);
        listaProductoDTO.add(dto3);
        listaProductoDTO.add(dto4);
        listaProductoDTO.add(dto5);
        for (ProductoDTO producto : listaProductoDTO){
            System.out.println(producto.toString());
        }
    }
}
