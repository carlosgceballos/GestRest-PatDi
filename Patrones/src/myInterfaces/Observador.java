package myInterfaces;

import myclasses.platos.Plato;

// Patron Observer - Interfaz para los observadores
public interface Observador {
  void actualizar(String mensaje, Plato plato);
}