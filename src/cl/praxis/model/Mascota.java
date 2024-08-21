package cl.praxis.model;

public class Mascota {
  private int id;
  private String nombre;
  private String raza;
  private TipoMascota tipoMascota;

  // dueño
  // genero

  public Mascota() {
  }

  public Mascota(int id, String nombre, String raza, TipoMascota tipoMascota) {
    this.id = id;
    this.nombre = nombre;
    this.raza = raza;
    this.tipoMascota = tipoMascota;
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

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public TipoMascota getTipoMascota() {
    return tipoMascota;
  }

  public void setTipoMascota(TipoMascota tipoMascota) {
    this.tipoMascota = tipoMascota;
  }
}
