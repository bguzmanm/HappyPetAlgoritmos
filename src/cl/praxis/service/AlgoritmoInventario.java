package cl.praxis.service;

import cl.praxis.model.Inventario;

import java.util.List;

public class AlgoritmoInventario {

  /**
   * Implementar un algoritmo que permita que en el caso que un stock sea
   * inferior a 15 unidades para los productos de tipo medicinal y
   * 5 unidades para los tipo accesorios para una sucursal determinada,
   * éste mande una advertencia de reposición inmediata por pantalla.
   * Se deberá pedir al usuario que entregue por consola el número de la
   * sucursal y el id de producto para re éste cálculo.
   */
  public  List<Inventario> validarExistencia(int sucursalId, String tipoInventarioNombre,
                                int stockMinimo, List<Inventario> inventarios){
    List<Inventario> inventarioSucursal = inventarios.stream()
            .filter(inventario -> inventario.getSucursal().getId() == sucursalId)
            .toList();

    List<Inventario> invPorTipo = inventarioSucursal.stream()
            .filter(inventario -> inventario.getTipoProducto().getDescripcion().equals(tipoInventarioNombre))
            .toList();

    return invPorTipo.stream()
                    .filter(inventario -> inventario.getExistencia() < stockMinimo).toList();

  }

  public void validarExistenciasPorSucursal(int sucursalId, List<Inventario> inventarios){
    List<Inventario> medicinalBajo = validarExistencia(sucursalId, "Remedio", 15, inventarios);
    List<Inventario> accesoriosBajo = validarExistencia(sucursalId, "Accesorio", 5, inventarios);

    showInventario(medicinalBajo);
    showInventario(accesoriosBajo);
  }


  public void showInventario(List<Inventario> list){
    for (Inventario inventario : list) {
      System.out.println(inventario.getNombre() + " quedan " + inventario.getExistencia() + " unidades");
    }
  }
}
