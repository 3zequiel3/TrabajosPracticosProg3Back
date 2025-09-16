package TP_DTOs_1;
import lombok.*;

@Data
public class ProductoDTO {
    private String nombre;
    private double precio;

    public ProductoDTO(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public ProductoDTO() {}

    @Override
    public String toString() {
        return nombre + " - $" + precio;
    }
}
