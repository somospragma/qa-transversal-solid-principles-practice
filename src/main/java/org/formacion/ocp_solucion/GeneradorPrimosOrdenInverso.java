package org.formacion.ocp_solucion;

import java.util.Comparator;

public class GeneradorPrimosOrdenInverso extends GeneradorPrimos{

    protected Comparator<Integer> getOrdination(){
        return (a,b) -> a > b ? -1:1;
    }
}
