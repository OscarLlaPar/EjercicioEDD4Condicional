/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioedd4condicional;

import java.util.Scanner;

/** This program asks for a number and tells if it is odd or even
 *
 * @author Óscar Llamas Parra
 */
public class Main {
    public static int n;//the number the user is going to type
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduzca número:");
        Scanner reader = new Scanner(System.in);
        n=reader.nextInt();
        
        if(n%2==0){
            System.out.println("PAR");
        }
        else{
            System.out.println("IMPAR");
        }
    }
    
}
