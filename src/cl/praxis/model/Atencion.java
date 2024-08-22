package cl.praxis.model;

import java.util.Date;

public class Atencion {
  private int id;
  private Mascota mascota;
  private TipoAtencion tipoAtencion;
  private Date realizacion;

  // fecha proxima revision
  // box de atención
  // sucursal
  // medico

  public Atencion() {
  }

  public Atencion(int id, Mascota mascota, TipoAtencion tipoAtencion, Date realizacion) {
    this.id = id;
    this.mascota = mascota;
    this.tipoAtencion = tipoAtencion;
    this.realizacion = realizacion;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Mascota getMascota() {
    return mascota;
  }

  public void setMascota(Mascota mascota) {
    this.mascota = mascota;
  }

  public TipoAtencion getTipoAtencion() {
    return tipoAtencion;
  }

  public void setTipoAtencion(TipoAtencion tipoAtencion) {
    this.tipoAtencion = tipoAtencion;
  }

  public Date getRealizacion() {
    return realizacion;
  }

  public void setRealizacion(Date realizacion) {
    this.realizacion = realizacion;
  }

  @Override
  public String toString() {
    return "Atencion{" +
            "id=" + id +
            ", mascota=" + mascota.getNombre() +
            ", tipoAtencion=" + tipoAtencion.getName() +
            ", realizacion=" + realizacion.toString() +
            '}';
  }
}
