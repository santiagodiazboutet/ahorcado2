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
public class PerdioExcepcion extends Exception {

    /**
     * Creates a new instance of <code>PerdioExcepcion</code> without detail
     * message.
     */
    public PerdioExcepcion() {
    }

    /**
     * Constructs an instance of <code>PerdioExcepcion</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public PerdioExcepcion(String msg) {
        super(msg);
    }
}
