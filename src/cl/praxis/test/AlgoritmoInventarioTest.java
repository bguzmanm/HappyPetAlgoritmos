package cl.praxis.test;

import cl.praxis.model.Inventario;
import cl.praxis.model.Sucursal;
import cl.praxis.model.TipoProducto;
import cl.praxis.service.AlgoritmoInventario;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class AlgoritmoInventarioTest {

  static List<Inventario> listado = new ArrayList<>();

  @BeforeAll()
  public static void  initData(){
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
  }


  @Test
  public void validarExistenciaTest(){
    AlgoritmoInventario service = new AlgoritmoInventario();
    List<Inventario> lista = service.validarExistencia(1, "Remedio", 15, listado);
    assertEquals(2, lista.size());

    for (Inventario inventario : lista) {
      assertTrue(inventario.getExistencia()<15);
    }
  }

}
