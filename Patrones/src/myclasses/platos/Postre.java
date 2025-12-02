package myclasses.platos;

public class Postre extends Plato {
    
  public Postre(String nombre, double precio) {
    super(nombre, precio, "Postre");
  }

  @Override
  public void preparar() {
    System.out.println("Preparando postre: " + nombre);
  }
}