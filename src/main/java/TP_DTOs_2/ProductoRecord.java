package TP_DTOs_2;

public record ProductoRecord(String codigo, String nombre, double precio, String autor) {

    @Override
    public String toString() {
        return String.format("Producto[nombre=%s, precio=%.2f]",nombre, precio);
    }
}
