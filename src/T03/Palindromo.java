/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T03;

import java.util.Scanner;

/**
 *
 * @author CarlosManuel
 */
public class Palindromo {
    
    public static void Pal () {
        Scanner sc = new Scanner (System.in);
        System.out.print("Digitalice el palindromo: ");
        String p = sc.nextLine();
        p = p.toLowerCase();
        p = p.replace(" ", "");
        p = p.replace(",", "");
        p = p.replace(".", "");
        char pp[] = p.toCharArray();
        char pp2[] = new char [pp.length];
        int c = 0;
        for(int i = pp.length - 1, j = 0; j < pp.length; i--, j++){
            pp2[j] = pp[i];
        }
        for (int i = 0; i< pp.length; i++) {
            if (pp[i]==pp2[i]){
                c++;
            }
        }
        for (int i = 0; i < pp.length; i++){
            System.out.print(pp[i] + " ... " + pp2[i] + ", ");
        } System.out.println("");
        if (pp.length == c) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }
        /*do{
            
        } while (pp.length);*/
        
        /*String aRemplazar="hola como estas";
        String remplazado=aRemplazar.replace("a", "");
        System.out.println(remplazado);//imprime hol como ests*/
        
    }
    
}
