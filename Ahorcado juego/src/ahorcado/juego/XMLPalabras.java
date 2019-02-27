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
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author capacita_mecon
 */
public class XMLPalabras {
    
    
    public static void serializarPalabras(Diccionario lista) {
        XMLEncoder encoder = null;
        String ruta=lista.GetDificultad()+"Dicc.xml";
        try
        {
            FileOutputStream file = new FileOutputStream(ruta);
            BufferedOutputStream salida = new BufferedOutputStream(file);
            encoder = new XMLEncoder(salida);
        } catch (FileNotFoundException fileNotFound)
        {
            fileNotFound.getMessage();
            System.out.println("ERROR- tu archivo no esta");
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

        return dicc;
    }
}
