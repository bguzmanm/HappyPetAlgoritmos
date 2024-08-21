package cl.praxis.model;

public class TipoProducto {
  private int id;
  private String descripcion;

  public TipoProducto() {
  }

  public TipoProducto(int id, String descripcion) {
    this.id = id;
    this.descripcion = descripcion;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
}
