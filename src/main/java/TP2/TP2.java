package TP2;

import TP1.Estudiante;
import java.util.ArrayList;
import java.util.List;

public class TP2 {
    public static void main(String[] args) {
        List<Estudiante> estudiantes1 = new ArrayList<>();
        estudiantes1.add(new Estudiante("Ezequiel", 21, "Sistemas Informaticos"));
        estudiantes1.add(new Estudiante("María", 25, "Diseño Gráfico y Programacion"));
        estudiantes1.add(new Estudiante("Agustin", 21, "Medicina"));

        Curso curso1 = new Curso("Estructuras de Datos", "Prof. Ezequiel Gonzalez", estudiantes1);

        List<Estudiante> estudiantes2 = new ArrayList<>();
        estudiantes2.add(new Estudiante("Lucía", 22, "Matemática"));
        estudiantes2.add(new Estudiante("Juan", 23, "Física"));

        Curso curso2 = new Curso("Algoritmos", "Prof. Ana Gómez", estudiantes2);

        System.out.println(curso1);
        System.out.println(curso2);
    }
}
