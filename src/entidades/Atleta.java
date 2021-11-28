/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.List;

/**
 *
 * @author ivan
 */
public abstract class Atleta {
    private String nombre;
    private String pais;
    private List<String> medalla;
    private List<String> record;

    public Atleta() {
    }

    public Atleta(String nombre, String pais, List<String> medalla, List<String> record) {
        this.nombre = nombre;
        this.pais = pais;
        this.medalla = medalla;
        this.record = record;
    }
    
      public Atleta(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public List<String> getMedalla() {
        return medalla;
    }

    public void setMedalla(List<String> medalla) {
        this.medalla = medalla;
    }

    public List<String> getRecord() {
        return record;
    }

    public void setRecord(List<String> record) {
        this.record = record;
    }    
}
