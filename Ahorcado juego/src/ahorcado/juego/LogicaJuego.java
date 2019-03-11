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
    
    
    
    public static void play(Jugador jugador, Palabra palabra){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingese el numero de vidas que desea utilizar.");
        jugador.Vidas=sc.nextInt();
        while(true){
            jugador.Intentos++;
          /*  if(!LogicaJuego.jugada(palabra)){
                jugador.Fallos++;
                jugador.Vidas--;
            }
            else{
                jugador.Aciertos++;
            }
            if(jugador.Vidas==0){
                System.out.println("PERDIO");
                break;
            }
            if(LogicaJuego.determinarGanador(palabra)){
                System.out.println("GANO");
                break;
            }*/
        }          
    }
    
    public static boolean jugada(Palabra a, char letra){
        Scanner sc = new Scanner(System.in);
        boolean resultado=false;
       
       
        a.palabra=a.palabra.toUpperCase();
        for (int i=0;a.status.length>i;i++) {
         
            if(a.palabra.charAt(i)==letra){
                
                a.status[i]=true;
                resultado=true;
               
            }
          
          
        }
            
      
        return resultado;
    }
    
    public static boolean determinarGanador(Palabra palabra){
        boolean ganador=true;
        for (boolean statu : palabra.status) {
            if (!statu){
                ganador=false;
                break;
            }
        }
        return ganador;
    }
    
    
}
