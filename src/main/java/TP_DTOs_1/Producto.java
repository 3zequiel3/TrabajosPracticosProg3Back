package TP_DTOs_1;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private String autor;
}
