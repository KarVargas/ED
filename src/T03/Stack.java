/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T03;

/**
 *
 * @author CarlosManuel
 */
public class Stack <T> {
    //Attribures
    private nodeClass top;
    private int size;
    
    //Constructor
    public Stack() {
        this.top = null;
        this.size = 0;
    }
    //Getters
    /**
     * 
     * @return stack's top
     */
    public nodeClass getTop(){
        return this.top;
    }
    /**
     * 
     * @return stack's size
     */
    public int getSize(){
        return this.size;
    }
    public boolean isEmpty(){
        return this.top == null;
    }
    /**
     * Introduce un nuevo elemento a la pila.
     * @param data node's info
     */
    public void push (T data) {
        nodeClass node = new nodeClass(data);
        if (isEmpty()) { //Si la pila está vacía.
            top = node;
        } else { //Si la pila no está vacía.
            node.setNext(top);
            top = node;
        } ++size;
    }
    /**
     * elimina un elemento de la pila.
     */
    public void pop() {
        if (!isEmpty()) {
            top = top.getNext();
            --size;
        } else { 
            System.out.println("La pila está vacía");
        }
    }
    /**
     * Vacía los elementos de la pila.
     */
    public void empty(){
        top = null;
        size = 0;
    }
    
    public void showStack() {
        if (!isEmpty()){
            nodeClass t = top;
            do {
                System.out.println(t.getData());
                System.out.println("|");
                System.out.println("V");
                t = t.getNext();
            } while(t.getNext()!=null);
            System.out.println("☠");
        }
    }
    
}
