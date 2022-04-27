/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.scenarisocket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author frabi
 */
public class Server {
    ServerSocket ss;
    Socket so;
    BufferedWriter bw;
    BufferedReader br;
    
    public Server(int porta)
    {
        try {
            ss = new ServerSocket(porta);
            System.out.println("Il server e' in ascolto");
            CountDown c = new CountDown(10);
            c.start();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void inAscolto()
    {
        try {
            so = ss.accept();
            System.out.println("Connessione stabilita");
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void scrivi(String messaggio)
    {
        try {
            bw = new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
            bw.write(messaggio+"\n");
            bw.flush();
                    
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
