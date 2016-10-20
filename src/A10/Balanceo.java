/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A10;

import EstructuradeDatos.*;
import java.util.Scanner;

/**
 *
 * @author CarlosManuel
 */
public class Balanceo {
    
    public static void balanceo(){
        String exp;
        exp = Balanceo.solicitaexp();
        if(evaluaexp(exp)){
            System.out.println("La exp esta balanceada");
        } else {
            System.out.println("La exp no esta balanceada");
        } 
    }
        
    private static String solicitaexp() {
        String e;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digitalice su expresión: ");
        e = sc.nextLine();
        return e;
    }

    private static boolean evaluaexp(String exp) {
        char e[] = exp.toCharArray();
        stackList s = new stackList();
        /*for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]); 
            if (c[i] == '(' || c[i] == '{' || c[i] == '[') {
                s.push(c[i]);
            } else if (c[i] == ')' || c[i] == '}' || c[i] == ']') {
                s.pop();
            }
        }*/
        //char ch[] = exp.toCharArray();
        for(int i = 0; i < e.length; i++) {
            if (e[i] == '(') {
                s.push(e[i]);
                //p++;
            } else if (e[i] == '{') {
                s.push(e[i]);
                //l++;
            } else if (e[i] == '[') {
                s.push(e[i]);
                //c++;
            } else if (e[i] == ')') {
                if (s.isEmpty()){
                    return false;
                } else if (s.getTop().getData().equals('(')) {
                    s.pop();
                } else {
                    return false;
                }
            } else if (e[i] == '}') {
                if (s.isEmpty()){
                    return false;
                } else if (s.getTop().getData().equals('{')) {
                    s.pop();
                } else {
                    return false;
                }
            } else if (e[i] == ']') { //
                if (s.isEmpty()){
                    return false;
                } else if (s.getTop().getData().equals('[')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
    
    /*private static char[] por(char a[]) {
        for ()
        if (char)
    }*/
}
