/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado.juego;

/**
 *
 * @author capacita_mecon
 */
public class AhorcadoJuego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jugador a=new Jugador("Yo");
        Palabra b=new Palabra("ornitorrinco","Perry el ...");
        LogicaJuego.play(a, b);
        
        
    }
    
}
