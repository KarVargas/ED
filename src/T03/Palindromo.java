/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T03;

import java.util.Scanner;
import EstructuradeDatos.*;

/**
 *
 * @author CarlosManuel
 */
public class Palindromo {
    public void Palindromo(){
        String p;
        p = createS();
        if(PalindromoN(PalN(p))){
            System.out.println("Es palindromo");
        } else {
            System.out.println("NO es palindromo");
        } 
    }
    stackList node = new stackList();
    stackList node2 = new stackList();
    public char[] PalN(String p){
        p = p.toLowerCase();
        p = p.replace(" ", "");
        p = p.replace(",", "");
        p = p.replace(".", "");
        char pp[] = p.toCharArray();
        char pp2[] = new char [pp.length];
        for(int h = pp.length - 1, j = 0; j < pp.length; h--, j++){
            pp2[j] = pp[h];
        }
        int i = 0;
        do {
            node.push(pp[i]);
            i++;
        }while(pp.length != i);
        //node.showStack();
        i = 0;
        do {
            node2.push(pp2[i]);
            i++;
        }while(pp.length != i);
        //node2.showStack();
        return pp;
    }
    public boolean PalindromoN(char pp[]){
        for (int i = 0; i < pp.length; i++) {
            if (node.getTop().getData()==node2.getTop().getData()) {
                node.pop();
                node2.pop();
            } else {
                return false;
            }
        } return true;
    }
    public static String createS () {
        Scanner sc = new Scanner (System.in);
        System.out.print("Digitalice el palindromo: ");
        String p = sc.nextLine();
        return p;
    }
    public static void Pal (String p) {
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
        Palindromo(c,pp);
        /*do{
        } while (pp.length);*/
        /*String aRemplazar="hola como estas";
        String remplazado=aRemplazar.replace("a", "");
        System.out.println(remplazado);//imprime hol como ests*/   
    }
    public static void Palindromo (int c, char pp[]) {
        if (pp.length == c) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }
    }
    
}
