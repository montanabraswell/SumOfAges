/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofages;

/**
 *
 * @author Montana
 */
import java.util.Scanner;
public class SumOfAges {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner (System.in);
        System.out.println("Type your name: ");
        String text = reader.nextLine();
        System.out.println();
        
        System.out.println("Type your age: ");
        int age = Integer.parseInt(reader.nextLine());
        System.out.println();
        
        System.out.println("Type your name: ");
        String text2 = reader.nextLine();
        
        System.out.println("Type your age: ");
        int age2 = Integer.parseInt(reader.nextLine());
        
        int sum;
        sum = age + age2;
        
        System.out.println("Matti and Arto are " + sum + " years old in total.");
    }
    
}
