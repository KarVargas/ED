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
public class A08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        doubleLnkList list = new doubleLnkList();
        list.insertFirst("Hola Mundo");
        list.showList();
        list.insertFirst(29);
        list.showList();
        list.insertLast(3.4);
        list.showList();
        list.searchNode("Hola Mundo");
        list.showList();
        list.eNode("Hola");
        list.deleteLast();
        list.showList();
        list.showListRever();
        
    }
    
}
