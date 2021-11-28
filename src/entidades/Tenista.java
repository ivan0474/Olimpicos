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
public class Tenista extends Atleta{
   private int posicion_atp;
   private boolean single;

    public Tenista() {
    }

    public Tenista(String nombre, String pais, int posicion_atp, boolean single) {
        super(nombre, pais);
        this.posicion_atp = posicion_atp;
        this.single = single;
    }

    public int getPosicion_atp() {
        return posicion_atp;
    }

    public void setPosicion_atp(int posicion_atp) {
        this.posicion_atp = posicion_atp;
    }

    public boolean isSingle() {
        return single;
    }

    public void setSingle(boolean single) {
        this.single = single;
    }

    @Override
    public String toString() {
        return "Tenista{" + "Nombre: " + getNombre() + ", posicion_atp=" + posicion_atp + ", single=" + single + '}';
    }
   
    
   
}
