/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A08;

/**
 *
 * @author CarlosManuel
 */
public class nodeDL <T> {
    //Attibutes
    T data;
    nodeDL next;
    nodeDL prev;
    //Methods
    /**
     * Este método es el constructor.
     * @param data es la información importante.
     */
    public nodeDL(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    
}
