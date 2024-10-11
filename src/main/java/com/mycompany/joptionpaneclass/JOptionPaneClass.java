/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.joptionpaneclass;
import java.util.Scanner;
import javax.swing.*;
/**
 *
 * @author RC_Student_lab
 */
public class JOptionPaneClass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
       int a, b;
       String num1, num2;
       num1= JOptionPane.showInputDialog(null, "Input first number");
       a = Integer.parseInt(num1);
       num2= JOptionPane.showInputDialog(null, "Input second number");
       b = Integer.parseInt(num2);
       
       while (true){
       String menu = "=====Menu====\n"+" 1.Addition\n"+"2.Subtraction\n"+"3.Multiplication\n"+"4.Division\n"+"0.Exit";
       
       String choice = JOptionPane.showInputDialog(menu);
       
       switch (choice){
           case "1": JOptionPane.showInputDialog(null, "The sum of " + a + "and "+ b +"is " + (a+b));
       break;
       case "2": JOptionPane.showInputDialog(null, "The difference of " + a + "and "+ b +"is " + (a-b));
       break; 
       case "3": JOptionPane.showInputDialog(null, "The product of " + a + "and "+ b +"is " + (a*b));
       break;
       case "4": JOptionPane.showInputDialog(null, "The quotient of " + a + " and "+ b +" is " + (a/b));
       break;
       case "5": JOptionPane.showInputDialog(null, "Exiting...");
       System.exit(0);
       }
       
       
       }                            
       
       
       
        
    }
}
