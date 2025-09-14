package TP_1_Collections;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Alumno {
    private String nombre;
    private double nota;

    @Override
    public String toString() {
        var format = String.format("""
                Nombre: %s 
                Nota: %.2f""", nombre, nota);
        return format;
    }
}
