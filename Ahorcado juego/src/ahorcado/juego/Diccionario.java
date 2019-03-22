/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado.juego;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

/**
 *
 * @author capacita_mecon
 */
public class Diccionario {
    private String _Dificultad;
    public ArrayList<Palabra> Palabras;
    public Diccionario(){
        this.Palabras= new ArrayList<Palabra>();
    }
    
    public void addPalabra(Palabra palabra){
        this.Palabras.add(palabra);
        
    }

    public static Palabra getRandomPalabra(String dificultad){
        Diccionario a = Diccionario.deserializarPalabras(dificultad);
        
        return a.Palabras.get((int) Math.floor(Math.random() * a.Palabras.size()));
    }

    public static void serializarPalabras(Diccionario lista, String Dificultad) {
        XMLEncoder encoder = null;
        String ruta=Dificultad+"Dicc.xml";
        try
        {
            FileOutputStream file = new FileOutputStream(ruta);
            BufferedOutputStream salida = new BufferedOutputStream(file);
            encoder = new XMLEncoder(salida);
        } catch (FileNotFoundException fileNotFound)
        {
            fileNotFound.getMessage();
            System.out.println("ERROR-archivo no esta");
        }

        encoder.writeObject(lista);
        encoder.close();
}

    public static Diccionario deserializarPalabras(String dificultad) {
        XMLDecoder decoder = null;
        dificultad += "Dicc.xml";
        System.out.println(dificultad);
        try {
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(dificultad)));
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: Archivo no encontrado");
        }
        
        Diccionario dicc = (Diccionario) decoder.readObject();
        decoder.close();
        return dicc;
    }
}
