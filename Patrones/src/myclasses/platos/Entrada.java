package myclasses.platos;

public class Entrada extends Plato {
    
    public Entrada(String nombre, double precio) {
        super(nombre, precio, "Entrada");
    }

    @Override
    public void preparar() {
        System.out.println("Preparando entrada: " + nombre);
    }
}