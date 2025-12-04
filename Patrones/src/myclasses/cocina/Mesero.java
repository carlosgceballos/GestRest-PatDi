package myclasses.cocina;

import myInterfaces.Observador;
import myclasses.platos.Plato;

// Observador concreto - El mesero que registra los pedidos
public class Mesero implements Observador {
  private String nombre;
  
  public Mesero(String nombre) {
    this.nombre = nombre;
  }
    
  @Override
  public void actualizar(String mensaje, Plato plato) {
    System.out.println("[Mesero " + nombre + "] notificado: " + mensaje);
    System.out.println("   Registrando pedido: " + plato.getNombre());
    System.out.println("   Total: $" + plato.getPrecio());
  }
}
