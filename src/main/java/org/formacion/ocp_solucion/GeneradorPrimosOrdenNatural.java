package org.formacion.ocp_solucion;

import java.util.Comparator;

public class GeneradorPrimosOrdenNatural extends GeneradorPrimos{

    protected Comparator<Integer> getOrdination(){
        return (a,b) -> a > b ? 1:-1;
    }


}
