package cl.praxis.model;

public class Inventario {
  private int id;
  private String nombre;
  private String marca;
  private int existencia;
  private TipoProducto tipoProducto;
  private Sucursal sucursal;

  public Inventario() {
  }

  public Inventario(int id, String nombre, String marca, int existencia, TipoProducto tipoProducto, Sucursal sucursal) {
    this.id = id;
    this.nombre = nombre;
    this.marca = marca;
    this.existencia = existencia;
    this.tipoProducto = tipoProducto;
    this.sucursal = sucursal;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public int getExistencia() {
    return existencia;
  }

  public void setExistencia(int existencia) {
    this.existencia = existencia;
  }

  public TipoProducto getTipoProducto() {
    return tipoProducto;
  }

  public void setTipoProducto(TipoProducto tipoProducto) {
    this.tipoProducto = tipoProducto;
  }

  public Sucursal getSucursal() {
    return sucursal;
  }

  public void setSucursal(Sucursal sucursal) {
    this.sucursal = sucursal;
  }

  @Override
  public String toString() {
    return "Inventario{" +
            "id=" + id +
            ", nombre='" + nombre + '\'' +
            ", marca='" + marca + '\'' +
            ", existencia=" + existencia +
            ", tipoProducto=" + tipoProducto.getDescripcion() +
            '}';
  }
}
