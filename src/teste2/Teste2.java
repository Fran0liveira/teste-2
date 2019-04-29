/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste2;

import java.util.Scanner;

/**
 *
 * @author kikol
 */
public class Teste2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Digite um número= ");
        int a = tec.nextInt();
        
        System.out.println("Digite outro número= ");
        int b = tec.nextInt();
        
        int resposta = a + b;
        
        System.out.printf("A soma entre %d e %d é = %d \n", a, b, resposta);
        
        System.out.println("Hello World!");
        System.out.println("Hello World 2");
    }
    
}
