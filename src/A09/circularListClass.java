/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A09;

/**
 *
 * @author CarlosManuel
 */
public class circularListClass <T>{
    //Attributes
    nodeClass pivot;
    
    //Contructor nulo
    public circularListClass(){
        pivot=null;
    }
    
    //Methods
    /**
     * 
     * @param d 
     */
    public void insert(T d){
        nodeClass node = new nodeClass(d); //Creamos nuestro nodo
        if(!isEmpty()){ //Si no está vacía la lista.
            //Insertamos el nodo al inicio y recorremos los nodos
            node.next = pivot;
            findLast().next = node;
            pivot = node;
        } else { //Si la lista está vacía.
            pivot = node;
            node.next = pivot;
        }
    }
    /**
     * 
     * @return 
     */
    public nodeClass findLast(){
        nodeClass t = pivot;
        do{
            t = t.next;
        }while(t.next!=pivot);
        return t;
    }
    /**
     * 
     * @return 
     */
    private boolean isEmpty(){
        return pivot == null;
    }
    /**
     * 
     * @param data
     * @return 
     */
    public nodeClass searchNode(T data){
        nodeClass t; //Declaro un nodo temporal.
        if (isEmpty()){ //Si está vacío retorna falso.
            System.out.println("La lista está vacía."); //Imprime comentario.
            return null;
        } else { //Si contiene elementos.
            t = pivot;
            if (t.data == data){
                return t;
            } else {
                t = t.next;
                while (t.data != data && t != pivot){
                    t = t.next;
                }
                if (t.data == data){
                    System.out.println("El nodo solicitado si se encuentra dentro de la lista."); //Imprime comentario.
                    return t;
                } else { //Si el valor del nodo es diferente a la información que se esta buscando.
                    System.out.println("El nodo no se encuentra dentro de la lista."); //Imprime comentario.
                    return null;
                }
            }
            /*t = pivot; //Colocamos auxiliar al inicio de la lista.
            while (t.data != data && t != pivot){ //Mientras que no encuentre el dato o no llegue al final de la lista, recorre la lista.
                t = t.next; //Recorre la lista, dando valor del apuntador para avanzar.
            } 
            if (t.data == data) { //Si el valor del nodo es igual a la información que se esta buscando.
                System.out.println("El nodo solicitado si se encuentra dentro de la lista."); //Imprime comentario.
                return t;
            } else { //Si el valor del nodo es diferente a la información que se esta buscando.
                System.out.println("El nodo no se encuentra dentro de la lista."); //Imprime comentario.
                return null;
            }
            /*if(t.data==data){return t;} //lo encontro y regresa el nodo
            else {return null;} //Llego al final y no lo encontro*/
        }
    }
    /**
     * 
     * @param data
     * @return 
     */
    public boolean deleteNode(T data){
        nodeClass t = searchNode(data);
        nodeClass tt = t;
        if (t == null) { //Si el nodo no existe.
            System.out.println("No se encontró el nodo."); //Imprime comentario.
            return false;
        } else { //Si el nodo existe.
            if (t == pivot) {
                findLast().next = t.next;
                pivot = t.next;
                t.next = null;
            } else {
                do {
                    tt = tt.next;
                } while (tt.next!=t);
                tt.next = t.next;
                t.next = null;
            } return true;
        }
    }
    /**
     * Este método muestra la lista completa con nodos en el caso de tener, por el contrario, te arroja un comentario diciendote que la lista está vacía.
     */
    public void showList(){
        if (isEmpty()){
            System.out.println("La lista está vacía");
        } else {
            nodeClass t; //Declaramos nodo temporal.
            t = pivot;
            System.out.print("->");
            do {
                System.out.print("["+t.getData()+"|]->");
                t=t.next;
            } while (t.next!=pivot.next);
            System.out.println(/*"☠"*/);   
        }
    }
}
