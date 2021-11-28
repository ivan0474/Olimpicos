/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import entidades.Tenista;
import entidades.Futbolista;
import entidades.Nadador;
import entidades.Registro;
import interfaces.Acciones;
import java.util.ArrayList;
import servicios.AccionesImpl;

/**
 *
 * @author ivan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Futbolistas
        Futbolista maradona = new Futbolista("Diego Maradona", "Argentina", 1000, "Delantero", 10, "Fallecido");
        Futbolista ronaldo = new Futbolista("Cristiano Ronaldo", "Portugal", 2000, "Delantero", 10, "Manchester United");
        ArrayList<Futbolista> listaFutbolistas = new ArrayList<>();
        listaFutbolistas.add(maradona);
        listaFutbolistas.add(ronaldo);
                
        //Tenistas
        Tenista rafael= new Tenista("Rafael Nadal", "España", 1, true);
        Tenista gonzalez = new Tenista("Fernando Gonzalez", "Chile", 1, true);
        ArrayList<Tenista> listaTenistas = new ArrayList<>();
        listaTenistas.add(rafael);
        listaTenistas.add(gonzalez);
        
        //Nadadores
        Nadador kristel = new Nadador("Kristel Kobrich","Chilena",200, true, true, true, "Mariposa");
        Nadador phelps = new Nadador ("Michal Phelps","USA",250, true, true, true, "Mariposa");
        ArrayList<Nadador> listaNadadores = new  ArrayList<>();
        listaNadadores.add(kristel);
        listaNadadores.add(phelps);
        
        //Listas
        Registro reg = new Registro();
        reg.setListaFutbolistas(listaFutbolistas);
        reg.setListaNadadores(listaNadadores);
        reg.setListaTenistas(listaTenistas);
        
        //Funcionalidades
        System.out.println("-------Lista de deportistas por categoria-------");
        reg.listar();
        System.out.println("\n-------Acciones que han realizado los deportistas ultimamente-------");
        Acciones acciones = new AccionesImpl();
        System.out.println(acciones.entrevista(rafael.getNombre()) + "\n");
        System.out.println("El resultado del dopping para " + maradona.getNombre() + " es: " + acciones.controlDopping(maradona.getNombre()) + "\n");
        System.out.println(phelps.getNombre() + " precalentó " + acciones.precalentar(phelps.getNombre()) + " minutos antes del juego");
    }
}
