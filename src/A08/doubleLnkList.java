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
public class doubleLnkList <T> {
    //Attributes
    nodeDL first;
    nodeDL last;
    
    //Methods
    /**
     * Este método inserta un nodo al inicio de la lista.
     * @param data es de tipo generica y contiene la información importante.
     */
    public void insertFirst(T data){
        nodeDL node = new nodeDL(data); //Creamos nuestro nodo
        if(isEmpty()){ //Si la lista está vacía
            this.first = node;
            this.last = node;
        } else { //Si la lista tiene elementos
            node.next = first; //El apuntador "SIGUIENTE" del nuevo nodo, apunta al primer nodo de la lista.
            first.prev = node; //El apuntador "ANTERIOR" del primer nodo de la lista, apunta al nuevo nodo.
            first = node; //El apuntador first (que es atributo de la lista) apunta al nuevo nodo.
        }
    }
    /**
     * Este método inserta un nodo al final de la lista.
     * @param data es de tipo generica y contiene la información importante.
     */
    public void insertLast(T data){
        nodeDL node = new nodeDL(data); //Creamos nuestro nodo
        if(isEmpty()){ //Si la lista está vacía
            this.first = node;
            this.last = node;
        } else { //Si la lista tiene elementos
            node.prev = last; //El apuntador "SIGUIENTE" del nuevo nodo, apunta al primer nodo de la lista.
            last.next = node; //El apuntador "ANTERIOR" del primer nodo de la lista, apunta al nuevo nodo.
            last = node; //El apuntador first (que es atributo de la lista) apunta al nuevo nodo.
        }
    }
    /**
     * 
     * @return 
     */
    private boolean isEmpty(){
        return first== null && last==null;
    }
    
        public nodeDL searchNode(T data){
        nodeDL t;
        if (isEmpty()){ //Si está vac+io retorna falso.
            return null;
        } else { //Si contiene elementos.
            t = first; //Colocamos auxiliar al inicio de la lista.
            while (t.data != data && t != last){ //Mientras que no encuentre el dato o no llegue al final de la lista, recorre la lista.
                t = t.next; //Recorre la lista.
            }
            if(t.data == data){
                return t;
            } else {
                return null;
            }
            /*if(t.data==data){return t;} //lo encontro y regresa el nodo
            else {return null;} //Llego al final y no lo encontro*/
        }
    }
    
    public boolean eNode(T data){
        nodeDL t = searchNode(data);
        if(t == null){
            System.out.println("No se encontró el nodo");
            return false;
        } else {
            if(t == first){
                deleteFirst();
            } else if (t == last){
                deleteLast();
            } else {
                t.prev.next = t.next;
                t.next.prev = t.prev;
            }
            return true;
        }
    }
    
    public void deleteFirst(){
        //Movemos al apuntador first al siguiente nodo y el previo de este lo ponemos null
        first = first.next; //Inicializamos first con el apuntador de first, para que así first pase a su apuntador y olvide el nodo en el que se encontraba.
        first.prev = null;
    }
    
    public void deleteLast(){
        //Movemos al apuntador last al nodo anterior y el next de este ultimo lo ponemos a null
        last = last.prev;
        last.next = null;
    }
    
    public void showList(){
        if (!isEmpty()){
            nodeDL t;
            t = (nodeDL) first;
            System.out.print("☠<=>");
            while(t!=null){
                System.out.print("[|"+t.data+"|]<=>");
                t=t.next;
            }
            System.out.println("☠");
        } else {
            System.out.println("La lista está vacía");
        }
    }
    
    public void showListRever(){
        if (!isEmpty()){
            nodeDL t;
            t = (nodeDL) last;
            System.out.print("☠<=>");
            while(t!=null){
                System.out.print("[|"+t.data+"|]<=>");
                t=t.prev;
            }
            System.out.println("☠");
        } else {
            System.out.println("La lista está vacía");
        }
    }
    
    public boolean deleteNode(T data){
        nodeDL t;
        if (isEmpty()){ //Si está vac+io returna falso.
            return false;
        } else { //Si contiene elementos.
            t = first; //Colocamos auxiliar al inicio de la lista.
            while (t.data != data && t != last){ //Mientras que no encuentre el dato o no llegue al final de la lista, recorre la lista.
                t = t.next; //Recorre la lista.
            }
            /*if(t == null){return false;} // No lo encontro
            else {
            t.next.prev=t.prev;
            t.prev.next=t.next;
            return true;}*/
            /*if (t.data==data) {
                t.next.prev=t.prev;
                t.prev.next=t.next;
                return true;}
            else {return false;}*/
            return t.data==data; //Si lo encuentra regresa true.
        }
    }
    
}
