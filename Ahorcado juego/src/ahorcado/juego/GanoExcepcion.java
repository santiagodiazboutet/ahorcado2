/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado.juego;

/**
 *
 * @author S
 */
public class GanoExcepcion extends Exception {

    /**
     * Creates a new instance of <code>GanoExcepcion</code> without detail
     * message.
     */
    public GanoExcepcion() {
    }

    /**
     * Constructs an instance of <code>GanoExcepcion</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public GanoExcepcion(String msg) {
        super(msg);
    }
}
