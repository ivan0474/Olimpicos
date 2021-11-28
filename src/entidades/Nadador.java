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
public  class  Nadador extends Atleta {
    private int  metros_lineales;
    private boolean piscina_temperada;
    private boolean ironman;
    private boolean trampolin;
    private String estilo;

    public Nadador() {
    }

    public Nadador(String nombre,String pais, int metros_lineales, boolean piscina_temperada, boolean ironman, boolean trampolin, String estilo) {
        super (nombre, pais);
        this.metros_lineales = metros_lineales;
        this.piscina_temperada = piscina_temperada;
        this.ironman = ironman;
        this.trampolin = trampolin;
        this.estilo = estilo;
    }

    public int getMetros_lineales() {
        return metros_lineales;
    }

    public void setMetros_lineales(int metros_lineales) {
        this.metros_lineales = metros_lineales;
    }

    public boolean isPiscina_temperada() {
        return piscina_temperada;
    }

    public void setPiscina_temperada(boolean piscina_temperada) {
        this.piscina_temperada = piscina_temperada;
    }

    public boolean isIronman() {
        return ironman;
    }

    public void setIronman(boolean ironman) {
        this.ironman = ironman;
    }

    public boolean isTrampolin() {
        return trampolin;
    }

    public void setTrampolin(boolean trampolin) {
        this.trampolin = trampolin;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return "Nadador{nombre: " + getNombre() + ", metros_lineales=" + metros_lineales + ", piscina_temperada=" + piscina_temperada + ", ironman=" + ironman + ", trampolin=" + trampolin + ", estilo=" + estilo + '}';
    }
    
    
}
