/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T03;

/**
 *
 * @author CarlosManuel
 * @param <T> Tipo de dato genérico
 */
public class nodeClass <T>{
    //Attributes
    private T data;
    private nodeClass next;
    
    //Constructor
    public nodeClass (T data) {
        this.data = data;
        this.next = null;
    }
    
    public void setData (T data) {
        this.data = data;
    }
    
    public T getData() {
        return this.data;
    }

    public nodeClass getNext() {
        return next;
    }

    public void setNext(nodeClass n) {
        this.next = n;
    }
    
}
