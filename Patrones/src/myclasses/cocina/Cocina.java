package myclasses.cocina;

import myInterfaces.Observador;
import myclasses.platos.Plato;
import java.util.ArrayList;
import java.util.List;

// Patron Observer - Sujeto que notifica a los observadores
public class Cocina {
  private List<Observador> observadores;
  private String nombreCocina;
    
  public Cocina(String nombreCocina) {
    this.nombreCocina = nombreCocina;
    this.observadores = new ArrayList<>();
  }
    
  // Agregar observador
  public void agregarObservador(Observador observador) {
    observadores.add(observador);
    System.out.println("  [Observador agregado a la cocina]");
  }
    
  // Eliminar observador
  public void eliminarObservador(Observador observador) {
    observadores.remove(observador);
  }
    
  // Notificar a todos los observadores
  public void notificarObservadores(String mensaje, Plato plato) {
    System.out.println("\n[COCINA " + nombreCocina + "] Notificando...");
    for (Observador obs : observadores) {
      obs.actualizar(mensaje, plato);
    }
  }
    
  // Metodo que simula recibir un nuevo pedido
  public void recibirPedido(Plato plato) {
    System.out.println("\nNuevo pedido recibido en cocina " + nombreCocina);
    notificarObservadores("Nuevo pedido", plato);
  }
}