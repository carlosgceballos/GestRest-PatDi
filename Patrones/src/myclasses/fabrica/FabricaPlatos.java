package myclasses.fabrica;

import myclasses.platos.*;

// Patron Factory Method
// Clase abstracta que define los metodos de fabrica
public abstract class FabricaPlatos {
    
  // Factory Methods - cada subclase implementara su version
  public abstract Plato crearEntrada();
  public abstract Plato crearPlatoPrincipal();
  public abstract Plato crearPostre();
    
  // Metodo que usa los factory methods
  public void mostrarMenu() {
    System.out.println("\n===== MENU " + getNombreCocina() + " =====");
    
    Plato entrada = crearEntrada();
    entrada.mostrarInfo();
        
    Plato platoPrincipal = crearPlatoPrincipal();
    platoPrincipal.mostrarInfo();
        
    Plato postre = crearPostre();
    postre.mostrarInfo();
    
    System.out.println("=====================================\n");
  }
    
  public abstract String getNombreCocina();
}