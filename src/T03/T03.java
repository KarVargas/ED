/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T03;
import EstructuradeDatos.*;

/**
 *
 * @author CarlosManuel
 */
public class T03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Contacto c = new Contacto("Francisco", 123456789);
        stackList s = new stackList();
        //s.push(c);
        //s.showStack();
        //s.push(10);
        //s.showStack();
        Palindromo.Pal(Palindromo.createS());
        Palindromo p = new Palindromo();
        p.Palindromo();
    }
    
    
    
}
