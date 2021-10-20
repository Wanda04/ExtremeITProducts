/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lwethu
 */

import java.util.*;
public class myMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
          
          ArrayList<String> Name = new ArrayList<>();  //declaration
          ArrayList<Integer> code = new ArrayList<>();
          ArrayList<String> colour = new ArrayList<>();
          ArrayList<Double> price = new ArrayList<>();
          
           Scanner scanner =new Scanner (System.in); 
           Scanner productColour = new Scanner(System.in);  // Creating a Scanner object
           Scanner productName = new Scanner(System.in);
           Scanner productCode = new Scanner(System.in);
           Scanner productPrice = new Scanner(System.in);
           
           
    while (true){
       
     System.out.print("Enter Product name:");
    Name.add(productName.next());  // Read user input
         
     System.out.print("Enter Product code:");
     code.add(productCode.nextInt());  
    
     System.out.print("Enter Product colour:");
     colour.add(productColour.next()); 
    
     System.out.print("Enter Product Price:");
     price.add(productPrice.nextDouble()); 
     
     System.out.println("add another directory: yes/no?");
             
             String answer = scanner.next();
            
            if (answer.equals("no")){
               
                System.out.println("Product name: "+Name);
                System.out.println("Product code:"+code);
                System.out.println("Product colour:"+colour);
                System.out.println("Product price($):"+price);
                System.out.println("");
                System.out.println("Goodbye");
                break; //
                 
            }
    
    }
}
}