package org.example.carrera_solidaria;

import java.util.ArrayList;
//Nombre y tipo de las clases
public class Organizador {
    final static String NOMBRE = "IES_MUTXAMEL";
    private String edicion;
    private ArrayList<Corredor> listaCorredores = new ArrayList<>();


    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public ArrayList<Corredor> getListaCorredores() {
        return listaCorredores;
    }

    public void setListaCorredores(ArrayList<Corredor> listaCorredores) {
        this.listaCorredores = listaCorredores;
    }

    //inscribe a un nuevo corredor
    public void inscribir_corredor(Corredor corredor) {
        if (Corredor.dorsal < 700){
            Corredor.dorsal++;
            System.out.println("Nueva inscripcion realizada. Corredor " + corredor.getNombre() + " con el dorsal " + Corredor.dorsal);
            listaCorredores.add(corredor);


        }
    }

    public void mostrarCorredores(){
        System.out.println("corredores inscritos " + Corredor.dorsal);
        for (int i = 1; i <= listaCorredores.size(); i++) {
            System.out.println("[" + i + "]. " + listaCorredores);
        }
    }
//    public void calcularDonacion(){
//        double resul = // tendria que ser numero_vueltas * importe vuelta y luego mostrarlo
//    }
    @Override
    public String toString() {
        return "Organizador{" +"Nombre='" + NOMBRE + ", edicion: "+ getEdicion() + ", listaCorredores=" + listaCorredores + '}';
    }

}
