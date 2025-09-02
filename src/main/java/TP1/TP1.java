package TP1;

import java.util.ArrayList;
import java.util.List;

public class TP1 {
    public static void main(String[] args) {
        List<Estudiante> lista = new ArrayList<>();
        lista.add(new Estudiante("Ezequiel", 21, "Sistemas Informaticos"));
        lista.add(new Estudiante("María", 25, "Diseño Gráfico y Programacion"));
        lista.add(new Estudiante("Agustin", 21, "Medicina"));

        System.out.println(lista);
    }
}