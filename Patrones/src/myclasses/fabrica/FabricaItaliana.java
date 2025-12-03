package myclasses.fabrica;

import myclasses.platos.*;

// Implementacion concreta del Factory Method para cocina italiana
public class FabricaItaliana extends FabricaPlatos {
    
  @Override
  public Plato crearEntrada() {
    return new Entrada("Bruschetta", 8.50);
  }
    
  @Override
  public Plato crearPlatoPrincipal() {
    return new PlatoPrincipal("Pasta Carbonara", 15.00);
  }
    
  @Override
  public Plato crearPostre() {
    return new Postre("Tiramisu", 7.00);
  }
    
  @Override
  public String getNombreCocina() {
    return "ITALIANO";
  }
}