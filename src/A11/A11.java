/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A11;
import EstructuradeDatos.*; //Se esta importando la libreria.
/**
 *
 * @author CarlosManuel
 */
public class A11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Deque d = new Deque(); /*Creamos un objeto para mandar a llamar a los 
            métodos que se encuentran en la libreria, unicamente los de el deque.*/
        d.showList();
        d.insertFirst(35);
        d.showList();
        d.insertLast(true);
        d.showList();
        System.out.println("El tamaño de la fila es de " + d.getSize());
        d.insertLast(12);
        d.showList();
        d.insertLast("HOLA!!");
        d.showList();        
        d.insertFirst(23);
        d.showList();
        d.insertLast(1.3);
        d.showList();
        d.eNodeFirst();
        d.showList();        
        System.out.println("El tamaño de la fila es de " + d.getSize());        
        d.eNodeFirst();
        d.showList();
        System.out.println("El tamaño de la fila es de " + d.getSize());
        d.eList();        
        d.showList();        
        System.out.println("El tamaño de la fila es de " + d.getSize());
    }
    
}
