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
public class Palabra {
    public String palabra;
    public String definicion;
    public boolean []status;
    public String fallos; 
    public Palabra(){}
    
    public Palabra(String word, String Def){
        this.palabra=word;
        this.definicion=Def;
        this.status=new boolean[(palabra.length())];
        this.fallos="124";
    }
    
    
    
    
    
}
