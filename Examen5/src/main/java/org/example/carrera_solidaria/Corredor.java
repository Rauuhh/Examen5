package org.example.carrera_solidaria;

import java.util.ArrayList;
import java.util.Arrays;

public class Corredor {
    private String nombre;
    public static int dorsal = 0;
    private ArrayList<String> listaPatrocinadores = new ArrayList<>();
    public double importe_vuelta;
    private int vueltas_completadas = 0;

    public Corredor(String nombre){
        this.nombre = nombre;
    }

    public Corredor(String nombre, double importe_vuelta){
        this.nombre = nombre;
        this.importe_vuelta = importe_vuelta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getImporte_vuelta() {
        return importe_vuelta;
    }

    public void setImporte_vuelta(double importe_vuelta) {
        if (importe_vuelta == 0){
            importe_vuelta = 0.5;
        }else{
        this.importe_vuelta = importe_vuelta;
        }
    }

    public ArrayList<String> getListaPatrocinadores() {
        return listaPatrocinadores;
    }

    public void setListaPatrocinadores(ArrayList<String> listaPatrocinadores) {
        this.listaPatrocinadores = listaPatrocinadores;
    }
    public int getVueltas_completadas() {
        return vueltas_completadas;
    }

    public void setVueltas_completadas(int vueltas_completadas) {
        this.vueltas_completadas = vueltas_completadas;
    }
    public static int calcularDorsal(int dorsal) {
        return dorsal++;
    }
    public void insertarPatrocinador(String... patros) {
listaPatrocinadores.addAll(Arrays.asList(patros));
        System.out.println("Nuevos patrocinadores añadidos para el corredor " + nombre);
    }
    public void calcularDonacion(){

    }
    @Override
    public String toString() {
        return "Corredor{" + "nombre='" + nombre + '\'' + ", listaPatrocinadores=" + listaPatrocinadores + ", importe_vuelta=" + importe_vuelta + " , numero_vueltas " + vueltas_completadas +  '}';
    }

}
