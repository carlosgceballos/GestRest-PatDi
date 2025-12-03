package myclasses.decoradores;

import myclasses.platos.Plato;

// Decorador concreto que agrega picante extra
public class ExtraPicante extends DecoradorPlato {
    
  public ExtraPicante(Plato plato) {
    super(plato);
    this.nombre = plato.getNombre() + " + Extra Picante";
    this.precio = plato.getPrecio() + 1.50;
  }
    
  @Override
  public void mostrarInfo() {
    System.out.println("=== " + tipo + " ===");
    System.out.println("Nombre: " + nombre);
    System.out.println("Precio: $" + precio);
    System.out.println("  [Decorado con: Salsa Picante Extra]");
  }
    
  @Override
  public void preparar() {
    platoDecorado.preparar();
    System.out.println("  + Agregando salsa picante extra...");
  }
}