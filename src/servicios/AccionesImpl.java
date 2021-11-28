/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import interfaces.Acciones;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author ivan
 */
public class AccionesImpl implements Acciones{
    @Override
    public String entrevista(String nombreDeportistas){
        return nombreDeportistas + " ha realizado una entrevista";
    }
    
    @Override
    public String controlDopping(String nombreDeportista){
        System.out.println(nombreDeportista + " ingresa a tomarse un control de dopping...");
        String dopping = "Negativo";
        Random random = new Random();
        if (random.nextBoolean()){
            dopping = "Positivo";
        }
        return dopping;
    }
    
    @Override
    public int precalentar(String nombreDeportistas){
        System.out.println(nombreDeportistas + " está empezando a precalentar");
        int calentamiento = ThreadLocalRandom.current().nextInt(0, 10);
        return calentamiento;
    }
}
