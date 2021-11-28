/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author ivan
 */
public class Futbolista extends Atleta {
    private  int cantidad_goles;
    private String posicion;
    private int numero_camiseta;
    private String club_donde_juega;

    public Futbolista() {
    }

    public Futbolista(String nombre, String pais, int cantidad_goles, String posicion, int numero_camiseta, String club_donde_juega) {
        super(nombre, pais);
        this.cantidad_goles = cantidad_goles;
        this.posicion = posicion;
        this.numero_camiseta = numero_camiseta;
        this.club_donde_juega = club_donde_juega;
    }

    public int getCantidad_goles() {
        return cantidad_goles;
    }

    public void setCantidad_goles(int cantidad_goles) {
        this.cantidad_goles = cantidad_goles;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNumero_camiseta() {
        return numero_camiseta;
    }

    public void setNumero_camiseta(int numero_camiseta) {
        this.numero_camiseta = numero_camiseta;
    }

    public String getClub_donde_juega() {
        return club_donde_juega;
    }

    public void setClub_donde_juega(String club_donde_juega) {
        this.club_donde_juega = club_donde_juega;
    }

    @Override
    public String toString() {
        return "Futbolista{Nombre: " + getNombre() + ", cantidad_goles=" + cantidad_goles + ", posicion=" + posicion + ", numero_camiseta=" + numero_camiseta + ", club_donde_juega=" + club_donde_juega + '}';
    }
    
}
