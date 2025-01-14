package org.formacion.srp_solucion;

import java.util.List;
import java.util.stream.Collectors;

public class ExportadorCSV {

	public String exporta (List<Pelicula> peliculas) {
		
		return peliculas.stream()
		      .map(p -> (p.getTitulo() + "," + p.getDirector() + "," + p.getGenero()))
		      .collect(Collectors.joining("\n"));
	}
}
