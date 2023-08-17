package org.formacion.srp_solucion;

import java.util.List;

import org.junit.Test;

import junit.framework.Assert;


public class TestRecomendador {

	@Test
	public void test() {

		Recomendador r = new Recomendador();
		
		List<Pelicula> recomenaciones = r.recomendaciones(BBDD.JUAN);
		
		Assert.assertEquals(BBDD.SOLDADO_RYAN,recomenaciones.get(0));

	}
	
	@Test 
	public void test_formato() {
		Recomendador r = new Recomendador();

		List<Pelicula> recomenaciones = r.recomendaciones(BBDD.JUAN);
		
		String csv = new ExportadorCSV().exporta(recomenaciones);
		
		String esperado = "Salvar al soldado Ryan,Spielberg,belico";
		
		Assert.assertEquals(esperado, csv);

	}

}
