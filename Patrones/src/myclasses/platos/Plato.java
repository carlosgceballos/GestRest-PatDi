package myclasses.platos;

// Clase abstracta base para todos los platos
public abstract class Plato {
  protected String nombre;
  protected double precio;
  protected String tipo;

  public Plato(String nombre, double precio, String tipo) {
      this.nombre = nombre;
      this.precio = precio;
      this.tipo = tipo;
  }

  public String getNombre() {
      return nombre;
  }

  public double getPrecio() {
      return precio;
  }

  public String getTipo() {
      return tipo;
  }

  // Metodo para mostrar informacion del plato
  public void mostrarInfo() {
      System.out.println("=== " + tipo + " ===");
      System.out.println("Nombre: " + nombre);
      System.out.println("Precio: $" + precio);
  }

  public abstract void preparar();
}
