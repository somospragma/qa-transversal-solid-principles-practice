package org.formacion.is_solucion;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestProcesadorTextoSolution {

	@Test
	public void test_simple() {
		
		Procesador procesador = new ProcesadorTexto();
		
		procesador.nueva("No");
		procesador.nueva("himporta");
		procesador.nueva("la");
		procesador.nueva("hortografia");
		
		assertEquals("No himporta la hortografia", procesador.texto());
	}
	
	@Test
	public void test_con_idioma() {
		
		MultiIdioma procesador = new ProcesadorTexto();
		
		procesador.nueva("Tengo");
		procesador.nueva("hambre");
		
		assertEquals("Tengo hambre", procesador.texto());
		
		assertTrue(procesador.correcto(Idioma.ES));
	}
}
