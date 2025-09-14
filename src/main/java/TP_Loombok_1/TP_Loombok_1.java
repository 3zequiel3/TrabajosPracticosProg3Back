package TP_Loombok_1;

import java.util.ArrayList;

public class TP_Loombok_1 {
    public static void main(String[] args) {
        System.out.println("Trabajo Practico 1 - Lombok");
        Persona persona1 = new Persona("Ezequiel", 30);
        Persona persona2 = new Persona();
        ArrayList<Persona> personas = new ArrayList<Persona>();
        personas.add(persona1);
        personas.add(persona2);
        for (Persona persona : personas) {
            System.out.println("Nombre:"+persona.getName() + " - " +"Edad:"+persona.getAge());
        }
    }
}
