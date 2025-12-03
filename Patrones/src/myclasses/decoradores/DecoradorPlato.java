package myclasses.decoradores;

import myclasses.platos.Plato;

// Patron Decorator
// Clase abstracta decoradora que envuelve un Plato
public abstract class DecoradorPlato extends Plato {
  protected Plato platoDecorado;
    
  public DecoradorPlato(Plato plato) {
    super(plato.getNombre(), plato.getPrecio(), plato.getTipo());
    this.platoDecorado = plato;
  }
    
  @Override
  public void mostrarInfo() {
    platoDecorado.mostrarInfo();
  }
    
  @Override
  public void preparar() {
    platoDecorado.preparar();
  }
}