// src/main/java/TP_2_Collections/Producto.java
package TP_2_Collections;

import lombok.*;
import java.util.Objects;
@Data
@AllArgsConstructor
public class Producto {
    private int codigo;
    private String descripcion;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto)) return false;
        Producto producto = (Producto) o;
        return codigo == producto.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
