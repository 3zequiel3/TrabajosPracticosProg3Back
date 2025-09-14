package TP_1_Collections;

import java.util.ArrayList;

public class TP_1_Collections {
    public static void main(String[] args) {
        System.out.println("Trabajo Practico 1 - Collections");
        Alumno alumno1 = Alumno.builder()
                .nombre("Ezequiel")
                .nota(8.5)
                .build();
        Alumno alumno2 = Alumno.builder()
                .nombre("María")
                .nota(9.0)
                .build();
        Alumno alumno3 = Alumno.builder()
                .nombre("Agustín")
                .nota(7.5)
                .build();
        Alumno alumno4 = Alumno.builder()
                .nombre("Lucía")
                .nota(10.0)
                .build();
        Alumno alumno5 = Alumno.builder()
                .nombre("Ezequiel GOnzalez")
                .nota(10.0)
                .build();
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);
        alumnos.add(alumno5);
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);}
    }
}
