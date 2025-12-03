package myclasses.decoradores;

import myclasses.platos.Plato;

// Decorador concreto que agrega queso extra
public class ExtraQueso extends DecoradorPlato {
    
  public ExtraQueso(Plato plato) {
    super(plato);
    this.nombre = plato.getNombre() + " + Extra Queso";
    this.precio = plato.getPrecio() + 2.00;
  }
    
  @Override
  public void mostrarInfo() {
    System.out.println("=== " + tipo + " ===");
    System.out.println("Nombre: " + nombre);
    System.out.println("Precio: $" + precio);
    System.out.println("  [Decorado con: Queso Extra]");
  }
    
  @Override
  public void preparar() {
    platoDecorado.preparar();
    System.out.println("  + Agregando queso extra...");
  }
}