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
     * Este método inserta un nodo al inicio de la lista.
     * @param d es de tipo generica y contiene la información importante.
     */
    public void insert(T d){
        nodeClass node = new nodeClass(d); //Creamos nuestro nodo
        if(!isEmpty()){ //Si no está vacía la lista.
            //Insertamos el nodo al inicio y recorremos los nodos
            node.next = pivot; //El APUNTADOR del nuevo nodo, apuntara al primer nodo de la lista, en este caso es pivote.
            findLast().next = node; //El APUNTADOR del último nodo, apuntara al nuevo nodo.
            pivot = node; //Pivote apuntara al nuevo nodo.
        } else { //Si la lista está vacía.
            pivot = node; //Se crea un nodo, dando así que pivote apunte al nuevo nodo, ya que solo existe uno.
            node.next = pivot; //El APUNTADOR del nuevo nodo apuntara a pivote.
        }
    }
    /**
     * Este método buscara el nodo final, o mejor dicho al nodo anterior a pivote.
     * @return t nodo importante que se encuentra antes de pivote.
     */
    public nodeClass findLast(){
        nodeClass t = pivot;
        do{ //Inicio de ciclo, hara lo siguiente hasta que cumpla while. Recorrera la lista para así conseguir el nodo anterior a pviote.
            t = t.next; //Recorre la lista, dando valor del apuntador para avanzar.
        }while(t.next!=pivot); //Mientras el APUNTADOR del nodo sea diferente a pivote, recorrera la lista. Una vez apuntando a pivote, se sale del ciclo. Fin del ciclo.
        return t;
    }
    /**
     * Este método verifica si la lista está vacía.
     * @return null en pivote en el caso que estuvieran vacías.
     */
    private boolean isEmpty(){
        return pivot == null;
    }
    /**
     * Este método busca un nodo en toda la lista.
     * @param data es de tipo generica y contiene la información importante.
     * @return dependiendo ya que si regresa null significa que la lista está vacía o que el nodo no se encuentra dentro de la lista, o regresa el nodo en el caso de que si lo encuentre.
     */
    public nodeClass searchNode(T data){
        nodeClass t; //Declaro un nodo temporal.
        if (isEmpty()){ //Si está vacío retorna falso.
            System.out.println("La lista está vacía."); //Imprime comentario.
            return null;
        } else { //Si contiene elementos.
            t = pivot; //Nodo temporal apuntando a pivote.
            if (t.data == data){ //Si la información del nodo es igual a la solicitada.
                return t;
            } else { //Si la información no era pivote.
                t = t.next; //El APUNTADOR del nodo, apuntara a su APUNTADOR, para moverse.
                while (t.data != data && t != pivot){ //Mientras que no encuentre el dato o no llegue al final de la lista, recorre la lista.
                    t = t.next; //Recorre la lista, dando valor del apuntador para avanzar.
                }
                if (t.data == data){ //Si el valor del nodo es igual a la información que se esta buscando.
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
     * Este método elimina un nodo independientemente de su posición.
     * @param data es de tipo generica y contiene la información importante.
     * @return depende ya que si regresa false significa que el nodo no se encuentra dentro de la lista, y si regresa true quiere decir que si se encuentra más aparte elimina el nodo.
     */
    public boolean deleteNode(T data){
        nodeClass t = searchNode(data); //Creamos un nodo apuntando a la información buscada.
        nodeClass tt = t; //Creamos un segundo nodo para así usarlo para buscar el nodo anterior.
        if (t == null) { //Si el nodo no existe.
            System.out.println("No se encontró el nodo."); //Imprime comentario.
            return false;
        } else { //Si el nodo existe.
            if (t == pivot) { //Si el nodo se encuentra en la primera posición, es decir en pivote.
                findLast().next = t.next; //El APUNTADOR del último nodo apuntará al APUNTADOR del nodo.
                pivot = t.next; //Pivote apuntara al APUNTADOR del nodo. 
                t.next = null; //El APUNTADOR del nodo apuntara a nulo.
            } else { //Si el nodo no sé encuentra en la primera posición.
                do { //Inicio de ciclo, hara lo siguiente hasta que cumpla while. Recorrera la lista para así conseguir el nodo anterior al nodo solicitado.
                    tt = tt.next; //El nood temporal apuntara al APUNTADOR del temporal del nodo, dando valor del apuntador para avanzar.
                } while (tt.next!=t); //Mientras el APUNTADOR del nodo temporal sea diferente al nodo, recorrera la lista. Una vez apuntando al nodo, se sale del ciclo. Fin del ciclo.
                tt.next = t.next; //El APUNTADOR del nodo temporal apuntara al APUNTADOR del nodo.
                t.next = null; //El APUNTADOR del nodo, apuntara a nulo.
            } return true;
        }
    }
    /**
     * Este método muestra la lista completa con nodos en el caso de tener, por el contrario, te arroja un comentario diciendote que la lista está vacía.
     */
    public void showList(){
        if (isEmpty()){ //Si la lista está vacía.
            System.out.println("La lista está vacía");
        } else { //En caso de que la lista no este vacía.
            nodeClass t; //Declaramos nodo temporal.
            t = pivot; //Donde nodo será igual al pivote (al inicio).
            System.out.print("->"); //Imprime comentario.
            do { //Inicio de ciclo, hara lo siguiente hasta que se cumpla while.
                System.out.print("["+t.getData()+"|]->"); //Imprime comentario, mientras imprime la información del nodo.
                t=t.next; //El nodo será igual a su apuntador "SIGUIENTE", para así recorrer toda la lista.
            } while (t.next!=pivot.next); //Mientras el APUNTADOR del nodo sea diferente al APUNTADOR de pivote, recorrera la lista. Una vez sea pivote, se sale del ciclo. Fin del ciclo.
            System.out.println(/*"☠"*/); //Imprime comentario.
        }
    }
}
