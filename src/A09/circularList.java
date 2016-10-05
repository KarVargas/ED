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
public class circularList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        circularListClass c = new circularListClass();
        c.insert("Hola Mundo"); 
        c.showList();
        c.insert(29);
        c.showList();
        c.insert(true);
        c.showList();
        c.insert(false);
        c.showList();
        c.insert(3);
        c.showList();
        //c.searchNode("Hola Mundo");
        c.showList();
        c.deleteNode("Hola Mundo");
        c.showList();
        c.deleteNode(false);
        c.showList();
        
    }
    
}
