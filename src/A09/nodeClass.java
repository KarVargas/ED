/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A09;

/**
 *
 * @author CarlosManuel
 * @param <T> tipo de dato Genérico.
 */
public class nodeClass <T> {
    //Attributes
    nodeClass next;
    T data;
    
    //Methods
    //Cosntructor con dato
    /**
     * 
     * @param data 
     */
    public nodeClass(T data) {
        this.data = data;
        this.next = null;
    }
    
    //Contructor nulo
    /**
     * 
     */
    public nodeClass(){
        this.data = data;
        this.next = null;
    }
    
    //Getters and Setters
    public T getData(){
        return this.data;
    }
    
    public void setData(T d){
        this.data = d;
    }
}
