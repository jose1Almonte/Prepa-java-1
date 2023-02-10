/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hallo
 */
public class Actividad1 extends Thread{
    int num_int;
    boolean until = true;
    String nombre;
    
    public Actividad1(){                
    }
    
    //
    @Override
    public void run(){
        try {
            // System.out.println("Soy la actividad: " + this.nombre);
            
            num_int = 0;
            
            while(until){
                System.out.println("Step " + num_int + " Hecho por: " + this.nombre);
                num_int++;
                Thread.sleep(500);
            }
            
//        for (int i = 0; i <= 5; i++){
//        System.out.println("Step "+i+ " Hecho por: " + this.nombre);
//        }    
        } catch (InterruptedException ex) {
            Logger.getLogger(Actividad1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void setParamName(String nuevo_nombre){
        this.nombre = nuevo_nombre;            
    }
    
    public void shift_sleep(){
        this.until = !until;
    }
}
