package TP_Loombok_2;

public class TP_Loombok_2 {
    public static void main(String[] args) {
        System.out.println("Trabajo Practico 2 - Lombok");
        Usuario user1 = Usuario.builder().build();
        Usuario user2 = Usuario.builder()
                .id(1)
                .name("Ezequiel")
                .email("3zequiel@gmail.com")
                .build();
        Usuario user3 = Usuario.builder()
                .id(2)
                .name("Juan")
                .email("queseyo@gmail.com")
                .build();
        System.out.println("Usuario 1: " + user1);
        System.out.println("Usuario 2: " + user2);
        System.out.println("Usuario 3: " + user3);
    }
}
