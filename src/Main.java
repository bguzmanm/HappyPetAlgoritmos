import cl.praxis.model.*;
import cl.praxis.service.AlgoritmoFecha;
import cl.praxis.service.AlgoritmoInventario;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    List<Inventario> listado = new ArrayList<>();

    listado.add(new Inventario(1, "producto 1", "hola", 10,
            new TipoProducto(1, "Accesorio"),
            new Sucursal(1, "sucursal 1", "", "")));

    listado.add(new Inventario(2, "producto 2", "hola", 3,
            new TipoProducto(1, "Accesorio"),
            new Sucursal(1, "sucursal 1", "", "")));

    listado.add(new Inventario(3, "producto 3", "hola", 14,
            new TipoProducto(2, "Remedio"),
            new Sucursal(1, "sucursal 1", "", "")));

    listado.add(new Inventario(5, "producto 5", "hola", 4,
            new TipoProducto(2, "Remedio"),
            new Sucursal(1, "sucursal 1", "", "")));

    listado.add(new Inventario(4, "producto 4", "hola", 6,
            new TipoProducto(2, "Remedio"),
            new Sucursal(2, "sucursal 2", "", "")));



    AlgoritmoInventario algo = new AlgoritmoInventario();

    int sucursalId = leerIntPorConsola("Ingresa el id de sucursal: ");

    algo.validarExistenciasPorSucursal(sucursalId, listado);
/*
    List<Atencion> agenda = new ArrayList<>();

    agenda.add(new Atencion(1,
            new Mascota(1, "perro", "perro",
                    new TipoMascota(1, "perros"))
    , new TipoAtencion(1, "Medica"), new Date()));
    agenda.add(new Atencion(2,
            new Mascota(2, "gato", "gato",
                    new TipoMascota(1, "gatos"))
    , new TipoAtencion(1, "Medica"), new Date()));
    agenda.add(new Atencion(3,
            new Mascota(3, "gato 3", "gato",
                    new TipoMascota(1, "gatos"))
    , new TipoAtencion(2, "Cirujía"), new Date()));

    AlgoritmoFecha af = new AlgoritmoFecha();

    try {
      af.agendaPorDia("2024-08-19", agenda);

    } catch (ParseException p){
      p.printStackTrace();
    }*/


  }



  public static int leerIntPorConsola(String mensaje){
    Scanner scanner = new Scanner(System.in);
    System.out.println(mensaje);
    return scanner.nextInt();
  }




}