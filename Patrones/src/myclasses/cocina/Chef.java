package myclasses.cocina;

import myInterfaces.Observador;
import myclasses.platos.Plato;

// Observador concreto - El chef que prepara los platos
public class Chef implements Observador {
  private String nombre;
  
  public Chef(String nombre) {
    this.nombre = nombre;
  }
    
  @Override
  public void actualizar(String mensaje, Plato plato) {
    System.out.println("[Chef " + nombre + "] notificado: " + mensaje);
    System.out.println("   Preparando: " + plato.getNombre());
    plato.preparar();
  }
}