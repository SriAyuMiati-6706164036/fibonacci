/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal8;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Fibonacci {
    public static void main(String[]args) {
         int f;
         Scanner in = new Scanner(System.in);
         int g = 1;
         int input;
         boolean a = false;
         
         System.out.println("input : ");
         f = in.nextInt();
         
         System.out.println(" ");
         
         g = f- g;
         f = f + g;
         
         System.out.println(f + " ");
         System.out.println();
     }
}
