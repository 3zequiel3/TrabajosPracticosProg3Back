package TP_3_Collections;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class TP_3_Collections {
    public static void main(String[] args) {
        Map<String,Curso> cursos = new HashMap<>();
        Curso curso1 = new Curso("Java", "Juan Perez");
        Curso curso2 = new Curso("Python", "Maria Gomez");
        Curso curso3 = new Curso("Java", "Carlos Lopez");
        Curso curso4 = new Curso("Java", "Juan Perez");
        Curso curso5 = new Curso("Python", "Maria Gomez");
        cursos.put("Curso1", curso1);
        cursos.put("Curso2", curso2);
        cursos.put("Curso3", curso3);
        cursos.put("Curso4", curso4);
        cursos.put("Curso5", curso5);

        String cursoKey = "Curso1";
        Curso cursoBuscado = cursos.get(cursoKey);

        if(cursoBuscado != null) {
            System.out.println("Curso encontrado: " + cursoBuscado);
        } else {
            System.out.println("Curso no encontrado");
        }

        Set <Map.Entry<String, Curso>> cursosConEntry = cursos.entrySet();
        for(Map.Entry<String, Curso> entry : cursosConEntry) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

    }
}
