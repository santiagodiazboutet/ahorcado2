/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado.juego;
import java.util.Scanner;
/**
 *
 * @author capacita_mecon
 */
public class LogicaJuego {
    
    
    public static boolean jugada(Palabra a, char letra){
        StringBuilder aux=new StringBuilder();
        
        boolean resultado=false;
       
       
       
        for (int i=0;a.getStatusLength()>i;i++) {
         
            if(a.getPalabra().charAt(i)==letra){
                
                a.setStatus(i,true);
                resultado=true;
               
            }
        }
        if(resultado==false){
            if(a.getFallos()=="0"){
          
                aux.append(letra);
 
            }
            else{
                aux.append(a.getFallos());
                aux.append(letra);
            
            }
            
            a.setFallos(aux.toString());
        }
        
        return resultado;
    }
    
  
    
    
}
