package TP_3_Collections;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Curso {
    private String nombre;
    private String docente;

    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", docente='" + docente + '\'' +
                '}';
    }
}
