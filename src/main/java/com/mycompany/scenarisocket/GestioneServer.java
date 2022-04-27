/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.scenarisocket;

/**
 *
 * @author frabi
 */
public class GestioneServer {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Server srv = new Server(2000);
        srv.inAscolto();
        srv.scrivi("Benvenuto client");
        
    }
    
    
    
    
}
