/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T04;

/**
 *
 * @author Los Beaters
 */
public class Tree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryTree b = new BinaryTree();
        b.insert(35);
        b.insert(50);
        b.insert(8);
        b.insert(12);
        b.insert(69);
        b.insert(84);
        b.insert(25);
        b.insert(75);
        b.insert(93);
        b.insert(16);
        b.delete(16);
        System.out.println("Pre-Orden");
        b.PreOrden();
        System.out.println("");
        System.out.println("");
        System.out.println("In-Orden");
        b.InOrden();
        System.out.println("");
        System.out.println("");
        System.out.println("Post-Orden");
        b.PosOrden();
        System.out.println("");
        
    }
}
