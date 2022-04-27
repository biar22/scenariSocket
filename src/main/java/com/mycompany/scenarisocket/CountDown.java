/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.scenarisocket;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author frabi
 */
public class CountDown extends Thread {
    private int tempo;

    public CountDown(int t)
    {
        this.tempo=t;
    }

    @Override
   
    public void run ()
    {
            for(int i = tempo; i>0; i--)
            {
                System.out.println(i);
                try {
                    sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(CountDown.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }

}