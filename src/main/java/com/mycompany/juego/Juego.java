/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.juego;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Juego {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int piedra = 1;
        int papel = 2;
        int tijera = 3; 
        int manoPersona = 0;
        int manoOrdenador = (int) (Math.random() * 3) + 1;
        int puntPersona = 0;
        int puntOrdenador = 0;
        
        do {
            manoOrdenador = (int) (Math.random() * 3) + 1;
            System.out.println("Inserta un numero del 1 al 3. Piedra es 1, papel es 2 y tijera es 3 ");
            manoPersona = leer.nextInt();
            
            if (manoPersona == papel && manoOrdenador == papel) {
                System.out.println("Has empatado");
            }else if (manoPersona == piedra && manoOrdenador == piedra){
                System.out.println("Has empatado");
            }else if (manoPersona == tijera && manoOrdenador == tijera) {
                System.out.println("Has empatado");
            }
            if (manoPersona == papel && manoOrdenador == piedra) {
                System.out.println("Has ganado");
                puntPersona++;
            } else if (manoPersona == tijera && manoOrdenador == papel) {
                System.out.println("Has ganado");
                puntPersona++;
            }else if (manoPersona == piedra && manoOrdenador == tijera) {
                System.out.println("Has ganado");
                puntPersona++;
            }
            
            if (manoPersona == papel && manoOrdenador == tijera) {
                System.out.println("Has perdido");
                puntOrdenador++;
            }else if (manoPersona == tijera && manoOrdenador == piedra) {
                System.out.println("Has perdido");
                puntOrdenador++;
            }else if (manoPersona == piedra && manoOrdenador == papel) {
                System.out.println("Has perdido");
                puntOrdenador++;
            }
        
        } while (puntPersona < 3 && puntOrdenador < 3);
        
        if (puntPersona == 3){
            System.out.println("Has ganado la partida");
        }else if (puntOrdenador == 3){
            System.out.println("Has perdido la partida");
        }
      
    }
}
        

