/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author ivan
 */
public class Registro {
    private ArrayList<Futbolista> listaFutbolistas;
    private ArrayList<Nadador> listaNadadores;
    private ArrayList<Tenista> listaTenistas;

    public Registro() {
    }

    public Registro(ArrayList<Futbolista> listaFutbolistas, ArrayList<Nadador> listaNadadores, ArrayList<Tenista> listaTenistas) {
        this.listaFutbolistas = listaFutbolistas;
        this.listaNadadores = listaNadadores;
        this.listaTenistas = listaTenistas;
    }

    public ArrayList<Futbolista> getListaFutbolistas() {
        return listaFutbolistas;
    }

    public void setListaFutbolistas(ArrayList<Futbolista> listaFutbolistas) {
        this.listaFutbolistas = listaFutbolistas;
    }

    public ArrayList<Nadador> getListaNadadores() {
        return listaNadadores;
    }

    public void setListaNadadores(ArrayList<Nadador> listaNadadores) {
        this.listaNadadores = listaNadadores;
    }

    public ArrayList<Tenista> getListaTenistas() {
        return listaTenistas;
    }

    public void setListaTenistas(ArrayList<Tenista> listaTenistas) {
        this.listaTenistas = listaTenistas;
    }
    
    public void listar(){
        for(Futbolista futbolista: listaFutbolistas){
            System.out.println(futbolista.toString());
        }
        for(Nadador nadador: listaNadadores){
            System.out.println(nadador.toString());
        }
        for(Tenista tenista: listaTenistas){
            System.out.println(tenista.toString());
        }
    }
    
}
