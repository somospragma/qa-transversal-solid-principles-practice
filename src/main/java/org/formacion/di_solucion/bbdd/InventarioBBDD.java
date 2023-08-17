package org.formacion.di_solucion.bbdd;


import org.formacion.di_solucion.negocio.Inventario;

public class InventarioBBDD implements Inventario {


	// Metodo de consulta a la base de datos
	
	public int numeroProductos(String tienda, String producto) {
		return BBDD.stocs.get(tienda).get(producto);
	}
}
