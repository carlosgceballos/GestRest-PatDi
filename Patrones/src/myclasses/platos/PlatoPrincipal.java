package myclasses.platos;

public class PlatoPrincipal extends Plato {
    
  public PlatoPrincipal(String nombre, double precio) {
      super(nombre, precio, "Plato Principal");
  }

  @Override
 public void preparar() {
      System.out.println("Preparando plato principal: " + nombre);
  }
}