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
public class Jugador {
    public String Nombre;
    public int Intentos;
    public int Fallos;
    public int Aciertos;
    public int Vidas;
    public Jugador(String Nombre){
        this.Nombre=Nombre;
        this.Intentos=0;
        this.Fallos=0;
        this.Aciertos=0;
        this.Vidas=0;
    }
}
