package myclasses.fabrica;

import myclasses.platos.*;

// Implementacion concreta del Factory Method para cocina mexicana
public class FabricaMexicana extends FabricaPlatos {
    
  @Override
  public Plato crearEntrada() {
    return new Entrada("Guacamole con Nachos", 7.00);
  }
    
  @Override
  public Plato crearPlatoPrincipal() {
    return new PlatoPrincipal("Tacos al Pastor", 12.50);
  }
    
  @Override
  public Plato crearPostre() {
    return new Postre("Flan Napolitano", 6.00);
  }
    
  @Override
  public String getNombreCocina() {
    return "MEXICANO";
  }
}