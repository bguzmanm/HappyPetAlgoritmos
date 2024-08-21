package cl.praxis.service;

import cl.praxis.model.Atencion;
import cl.praxis.model.Inventario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlgoritmoFecha {
  /**
   * Implementar un algoritmo que permite saber que mascotas
   * deben tener una cita de revisión con el médico para fecha,
   * tomando como base la fecha indicada en el atención:
   * YYYY-MM-DD
   */

  private static final String REGEX_FECHA = "^\\d{4}-\\d{2}-\\d{2}$";
  private static final Pattern PATRON_FECHA = Pattern.compile(REGEX_FECHA);

  public void agendaPorDia(String fechaStr, List<Atencion> agenda) throws ParseException {
    if (!isFechaValida(fechaStr)){
      System.out.println("Fecha invalida");
      return;
    }

    Date fecha = toFecha(fechaStr);
    System.out.println(fecha);
      List<Atencion> agendaDia = agenda.stream().filter(atencion ->
              {
                try {
                  return toCadena(atencion.getRealizacion()).equals(toCadena(fecha));
                } catch (ParseException e) {
                  throw new RuntimeException(e);
                }
              }
      ).toList();
    agendaDia.forEach(System.out::println);
  }

  public Date toFecha(String fechaStr) throws ParseException {
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    return formatter.parse(fechaStr);
  }

  public String toCadena(Date fecha) throws ParseException {
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    return formatter.format(fecha);
  }

  public boolean isFechaValida(String fecha){
    if (fecha == null){
      return false;
    }
    Matcher matcher = PATRON_FECHA.matcher(fecha);
    return matcher.matches();
  }

}
