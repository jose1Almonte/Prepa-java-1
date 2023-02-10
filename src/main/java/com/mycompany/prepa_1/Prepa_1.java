/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prepa_1;

import Classes.Actividad1;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hallo
 */
public class Prepa_1 {

    public static void main(String[] args) {
        Actividad1 juan = new Actividad1();
        Actividad1 jose = new Actividad1();
        
        juan.setParamName("juan");
        jose.setParamName("jose");
        juan.start();
        jose.start();
        
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Prepa_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        juan.setParamName("JUAN GABRIEL");
        jose.setParamName("JOSE ANTONIO");
//        juan.shift_sleep();
//        jose.shift_sleep();
        
    }
}
