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
        this.palabra=word.toUpperCase();
        this.definicion=Def.toUpperCase();
        this.status=new boolean[(palabra.length())];
        this.fallos="0";
    }
    
    public String getPalabra(){
        
        return this.palabra;
    }
    public String getDefinicion(){
        
        return this.definicion;
    }
    public boolean getStatus(int index){
        
        return this.status[index];
    }
    public String getFallos(){
        
        return this.fallos;
    }
    public int getStatusLength(){
        
        return this.status.length;
    }
    public void setPalabra(String a){
        
       this.palabra=a;
    }
    public void setDefinicion(String a){
        
        this.definicion=a;
    }
    public void setStatus(int index,boolean stat){
        
        this.status[index]=stat;
    }
    public void setFallos(String fallo){
        
        this.fallos=fallo;
    }
    public int getFallosLength(){
        
        return this.fallos.length();
    }
    public void newStatus(boolean[] stat){
        
        this.status=stat;
    }
}
