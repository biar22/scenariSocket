/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.scenarisocket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author frabi
 */
public class Client {
    ServerSocket ss;
    Socket so;
    BufferedWriter bw;
    BufferedReader br;
    public Client (InetAddress ip, int porta)
    {
        try {
            so = new Socket(ip, porta);
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String leggi()
    {
        String msg = "";
        try {
            br = new BufferedReader(new InputStreamReader(so.getInputStream()));
            
            msg = br.readLine();
                    
                    } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "";
    }
    
}
