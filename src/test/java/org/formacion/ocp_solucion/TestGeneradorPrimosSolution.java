package org.formacion.ocp_solucion;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;

public class TestGeneradorPrimosSolution {
	
	@Test
	public void test_orden_natural() {
		
		GeneradorPrimos generador = new GeneradorPrimosOrdenNatural();
		List<Integer> expected = Arrays.asList(2,3,5,7,11,13);
		
		Assert.assertThat(generador.primos(15), is(expected));
	}	

	@Test
	public void test_orden_inverso() {
		
		GeneradorPrimos generador = new GeneradorPrimosOrdenInverso();
		List<Integer> expected = Arrays.asList(13,11,7,5,3,2);
		
		Assert.assertThat(generador.primos(15), is(expected));
	}

}