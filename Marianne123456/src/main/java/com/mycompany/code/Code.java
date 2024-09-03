/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.code;
import java.util.Scanner;
/**
 *
 * @author CL3-PC34
 */
public class Code {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner input =  new Scanner (System.in);
           
        System.out.println("Menu");
        
        
        System.out.println("[1] = Snacks");
        System.out.println("[2] = Drinks");
         
        
         
        System.out.println("Enter Your Choice: ");
        int ch1 = input.nextInt();
       
        
        if (ch1==1)
        {
            System.out.println("[1] = V-Cut - 45 Pesos");
            System.out.println("[2] = Piatos - 35 Pesos");
            System.out.println("Enter Your Choice: ");
            int ch2 = input.nextInt(); 
            
            
            if (ch2 == 1)
            {
                 System.out.println("V-Cut - 45 Pesos");
                 int vcut, piatos;
                 vcut = 45;
                 piatos = 35;
                 
                 System.out.println("Would You Like To Order Drinks? [1] = Yes Or [2] = No");
                 int ch3 = input.nextInt();
                 
                 if(ch3 == 1)
                 {
                     System.out.println("[1] = Sprite - 25 Pesos");
                     System.out.println("[2] = Water - 20 Pesos");
                     System.out.println("Enter Your Choice: ");
                     int ch4 = input.nextInt();
                     int sprite, water;
                     sprite = 25;
                     water = 20;
                     
                     if(ch4 == 1)
                     {
                         System.out.println("Sprite - 25 Pesos");
                         
                         int tot;
                         tot = sprite + vcut;
                         System.out.println("Total Is " + tot);
                         System.out.println("Enter Your Cash: ");
                         
                         int cash = input.nextInt();
                         
                         while (cash < tot)
                         {
                             System.out.println("Try Again!!");
                             System.out.println("Enter Your Cash!!");
                             
                             cash = input.nextInt(); 
                         }
                         if (cash >= tot)
                         {
                             int change;
                             change = cash - tot;
                             System.out.println("Your Change Is: " + change);
                         }
                     }
                     else if(ch4==2)
                     {                      
                         System.out.println("Water - 20 Pesos");
                         
                         int tot;
                         tot = water + vcut;
                         System.out.println("Total Is " + tot);
                         System.out.println("Enter Your Cash: ");
                         
                         int cash = input.nextInt();
                         
                         while (cash < tot)
                         {
                             System.out.println("Try Again!!");
                             System.out.println("Enter Your Cash!!");
                             
                             cash = input.nextInt(); 
                         }
                         if (cash >= tot)
                         {
                             int change;
                             change = cash - tot;
                             System.out.println("Your Change Is: " + change);
                         }
                     }
                     else
                     {
                         System.out.println("Invalid Input");
                         
                         int tot;
                         tot = vcut;
                         System.out.println("Total Is " + tot);
                         System.out.println("Enter Your Cash: ");
                         
                         int cash = input.nextInt();
                         
                         while (cash < tot)
                         {
                             System.out.println("Try Again!!");
                             System.out.println("Enter Your Cash!!");
                             
                             cash = input.nextInt(); 
                         }
                         if (cash >= tot)
                         {
                             int change;
                             change = cash - tot;
                             System.out.println("Your Change Is: " + change);
                         }
                     }
                     

                 }
                 else if (ch3==2)
                     {
                        
                    
                        
                    
                         int tot;
                         tot = vcut;
                         System.out.println("Total Is " + tot);
                         System.out.println("Enter Your Cash: ");
                         
                         int cash = input.nextInt();
                         
                         while (cash < tot)
                         {
                             System.out.println("Try Again!!");
                             System.out.println("Enter Your Cash!!");
                             
                             cash = input.nextInt(); 
                         }
                         if (cash >= tot)
                         {
                             int change;
                             change = cash - tot;
                             System.out.println("Your Change Is: " + change);
                         }
                     } 
                 else if (ch3>=3)
                     {
                        
                        System.out.println("Invalid Input");
                    
                         int tot;
                         tot = vcut;
                         System.out.println("Total Is " + tot);
                         System.out.println("Enter Your Cash: ");
                         
                         int cash = input.nextInt();
                         
                         while (cash < tot)
                         {
                             System.out.println("Try Again!!");
                             System.out.println("Enter Your Cash!!");
                             
                             cash = input.nextInt(); 
                         }
                         if (cash >= tot)
                         {
                             int change;
                             change = cash - tot;
                             System.out.println("Your Change Is: " + change);
                         }
                     }
            }
        
            else if (ch2==2)
        {
                 System.out.println("Piatos - 35 Pesos");
                 int vcut, piatos;
                 vcut = 45;
                 piatos = 35;
                 
                 System.out.println("Would You Like To Order Drinks? [1] = Yes Or [2] = No");
                 int ch3 = input.nextInt();
                 
                 if(ch3 == 1)
                 {
                     System.out.println("[1] = Sprite -25 Pesos");
                     System.out.println("[2] = Water - 20 Pesos");
                     System.out.println("Enter Your Choice: ");
                     int ch4 = input.nextInt();
                     int sprite, water;
                     sprite = 25;
                     water = 20;
                     
                     if(ch4 == 1)
                     {
                         System.out.println("Sprite - 25 Pesos");
                         
                         int tot;
                         tot = sprite + piatos;
                         System.out.println("Total Is " + tot);
                         System.out.println("Enter Your Cash: ");
                         
                         int cash = input.nextInt();
                         
                         while (cash < tot)
                         {
                             System.out.println("Try Again!!");
                             System.out.println("Enter Your Cash!!");
                             
                             cash = input.nextInt(); 
                         }
                         if (cash >= tot)
                         {
                             int change;
                             change = cash - tot;
                             System.out.println("Your Change Is: " + change);
                         }
                      }
                     else if (ch4==2)
                     {
                         System.out.println("Water - 20 Pesos");
                         
                         int tot;
                         tot = water + piatos;
                         System.out.println("Total Is " + tot);
                         System.out.println("Enter Your Cash: ");
                         
                         int cash = input.nextInt();
                         
                         while (cash < tot)
                         {
                             System.out.println("Try Again!!");
                             System.out.println("Enter Your Cash!!");
                             
                             cash = input.nextInt(); 
                         }
                         if (cash >= tot)
                         {
                             int change;
                             change = cash - tot;
                             System.out.println("Your Change Is: " + change);
                         }
                     }
                     else
                    {
                        System.out.println("Invalid Input");
                        
                        int tot;
                         tot = piatos;
                         System.out.println("Total Is " + tot);
                         System.out.println("Enter Your Cash: ");
                         
                         int cash = input.nextInt();
                         
                         while (cash < tot)
                         {
                             System.out.println("Try Again!!");
                             System.out.println("Enter Your Cash!!");
                             
                             cash = input.nextInt(); 
                         }
                         if (cash >= tot)
                         {
                             int change;
                             change = cash - tot;
                             System.out.println("Your Change Is: " + change);
                         }
                    }
                  }
                 else if (ch3==2)
                     {
                         
            
                         int tot;
                         tot = piatos;
                         System.out.println("Total Is " + tot);
                         System.out.println("Enter Your Cash: ");
                         
                         int cash = input.nextInt();
                         
                         while (cash < tot)
                         {
                             System.out.println("Try Again!!");
                             System.out.println("Enter Your Cash!!");
                             
                             cash = input.nextInt(); 
                         }
                         if (cash >= tot)
                         {
                             int change;
                             change = cash - tot;
                             System.out.println("Your Change Is: " + change);
                         }
                     }
                  else if (ch3>=2)
                     {
                         
                         System.out.println("Invalid Input");
            
                         int tot;
                         tot = piatos;
                         System.out.println("Total Is " + tot);
                         System.out.println("Enter Your Cash: ");
                         
                         int cash = input.nextInt();
                         
                         while (cash < tot)
                         {
                             System.out.println("Try Again!!");
                             System.out.println("Enter Your Cash!!");
                             
                             cash = input.nextInt(); 
                         }
                         if (cash >= tot)
                         {
                             int change;
                             change = cash - tot;
                             System.out.println("Your Change Is: " + change);
                         }
                     }
                 else
                    {
            System.out.println("Invalid Input");
                    }
            }
            else
                    {
            System.out.println("Invalid Input");
                    }
            
        }  
    
        
        ///2///
        
        if (ch1==2)
        {
            System.out.println("[1] = Sprite -25 Pesos");
            System.out.println("[2] = Water - 20 Pesos");
            System.out.println("Enter Your Choice: ");
            
            int ch2 = input.nextInt(); 
            
            
            if (ch2 == 2)
            {
                System.out.println("Water - 20 Pesos");
                 int sprite, water;
                     sprite = 25;
                     water = 20;
                 
                 
                 System.out.println("Would You Like To Order Snacks? [1] = Yes Or [2] = No");
                 int ch3 = input.nextInt();
                 
                 if(ch3 == 1)
                 {
                     System.out.println("[1] = V-Cut - 45 Pesos");
                     System.out.println("[2] = Piatos - 35 Pesos");
                     System.out.println("Enter Your Choice: ");
                     int ch4 = input.nextInt();
                     int vcut, piatos;
                     vcut = 45;
                     piatos = 35;
                     
                     if(ch4 == 2)
                     {
                         System.out.println("Piatos - 35 Pesos");
                         
                         int tot;
                         tot = water + piatos;
                         System.out.println("Total Is " + tot);
                         System.out.println("Enter Your Cash: ");
                         
                         int cash = input.nextInt();
                         
                         while (cash < tot)
                         {
                             System.out.println("Try Again!!");
                             System.out.println("Enter Your Cash!!");
                             
                             cash = input.nextInt(); 
                         }
                         if (cash >= tot)
                         {
                             int change;
                             change = cash - tot;
                             System.out.println("Your Change Is: " + change);
                         }
                     }
                     else if (ch4==1)
                     {
                         System.out.println("V-Cut - 45 Pesos");
                         
                         int tot;
                         tot = water + vcut;
                         System.out.println("Total Is " + tot);
                         System.out.println("Enter Your Cash: ");
                         
                         int cash = input.nextInt();
                         
                         while (cash < tot)
                         {
                             System.out.println("Try Again!!");
                             System.out.println("Enter Your Cash!!");
                             
                             cash = input.nextInt(); 
                         }
                         if (cash >= tot)
                         {
                             int change;
                             change = cash - tot;
                             System.out.println("Your Change Is: " + change);
                         }
                     }
                     else
                    {
                        System.out.println("Invalid Input");
                        
                        int tot;
                         tot = water;
                         System.out.println("Total Is " + tot);
                         System.out.println("Enter Your Cash: ");
                         
                         int cash = input.nextInt();
                         
                         while (cash < tot)
                         {
                             System.out.println("Try Again!!");
                             System.out.println("Enter Your Cash!!");
                             
                             cash = input.nextInt(); 
                         }
                         if (cash >= tot)
                         {
                             int change;
                             change = cash - tot;
                             System.out.println("Your Change Is: " + change);
                         }
                    }
                      
                 }
                 else if (ch3==2)
                     {
                       
                         int tot;
                         tot = water;
                         System.out.println("Total Is " + tot);
                         System.out.println("Enter Your Cash: ");
                         
                         int cash = input.nextInt();
                         
                         while (cash < tot)
                         {
                             System.out.println("Try Again!!");
                             System.out.println("Enter Your Cash!!");
                             
                             cash = input.nextInt(); 
                         }
                         if (cash >= tot)
                         {
                             int change;
                             change = cash - tot;
                             System.out.println("Your Change Is: " + change);
                         }
                     }
                 else if (ch3>=3)
                     {
                         System.out.println("Invalid Input");
                         
                         int tot;
                         tot = water;
                         System.out.println("Total Is " + tot);
                         System.out.println("Enter Your Cash: ");
                         
                         int cash = input.nextInt();
                         
                         while (cash < tot)
                         {
                             System.out.println("Try Again!!");
                             System.out.println("Enter Your Cash!!");
                             
                             cash = input.nextInt(); 
                         }
                         if (cash >= tot)
                         {
                             int change;
                             change = cash - tot;
                             System.out.println("Your Change Is: " + change);
                         }
                     }
                 
            }
            else if (ch2==1)
            {
                System.out.println("Sprite - 25 Pesos");
                 int sprite, water;
                     sprite = 25;
                     water = 20;
                 
                 
                 System.out.println("Would You Like To Order Snacks? [1] = Yes Or [2] = No");
                 int ch3 = input.nextInt();
                 
                 if(ch3==1)
                 {
                     System.out.println("[1] = V-Cut - 45 Pesos");
                     System.out.println("[2] = Piatos - 35 Pesos");
                     System.out.println("Enter Your Choice: ");
                     int ch4 = input.nextInt();
                     int vcut, piatos;
                     vcut = 45;
                     piatos = 35;
                     
                     if(ch4 == 2)
                     {
                         System.out.println("Piatos - 35 Pesos");
                         
                         int tot;
                         tot = sprite + piatos;
                         System.out.println("Total Is " + tot);
                         System.out.println("Enter Your Cash: ");
                         
                         int cash = input.nextInt();
                         
                         while (cash < tot)
                         {
                             System.out.println("Try Again!!");
                             System.out.println("Enter Your Cash!!");
                             
                             cash = input.nextInt(); 
                         }
                         if (cash >= tot)
                         {
                             int change;
                             change = cash - tot;
                             System.out.println("Your Change Is: " + change);
                         }
                     }
                     else if (ch4==1)
                     {
                         System.out.println("V-Cut - 45 Pesos");
                         
                         int tot;
                         tot = sprite + vcut;
                         System.out.println("Total Is " + tot);
                         System.out.println("Enter Your Cash: ");
                         
                         int cash = input.nextInt();
                         
                         while (cash < tot)
                         {
                             System.out.println("Try Again!!");
                             System.out.println("Enter Your Cash!!");
                             
                             cash = input.nextInt(); 
                         }
                         if (cash >= tot)
                         {
                             int change;
                             change = cash - tot;
                             System.out.println("Your Change Is: " + change);
                         }
                     }
                     else
                    {
                        System.out.println("Invalid Input");
                        
                        int tot;
                         tot = water;
                         System.out.println("Total Is " + tot);
                         System.out.println("Enter Your Cash: ");
                         
                         int cash = input.nextInt();
                         
                         while (cash < tot)
                         {
                             System.out.println("Try Again!!");
                             System.out.println("Enter Your Cash!!");
                             
                             cash = input.nextInt(); 
                         }
                         if (cash >= tot)
                         {
                             int change;
                             change = cash - tot;
                             System.out.println("Your Change Is: " + change);
                         }
                    }
                      
                 }
                 else if (ch3==2)
                     {
                        
                         int tot;
                         tot = water;
                         System.out.println("Total Is " + tot);
                         System.out.println("Enter Your Cash: ");
                         
                         int cash = input.nextInt();
                         
                         while (cash < tot)
                         {
                             System.out.println("Try Again!!");
                             System.out.println("Enter Your Cash!!");
                             
                             cash = input.nextInt(); 
                         }
                         if (cash >= tot)
                         {
                             int change;
                             change = cash - tot;
                             System.out.println("Your Change Is: " + change);
                         }
                     }
                 else if (ch3>=3)
                     {
                         System.out.println("Invalid Input");
                         
                         int tot;
                         tot = water;
                         System.out.println("Total Is " + tot);
                         System.out.println("Enter Your Cash: ");
                         
                         int cash = input.nextInt();
                         
                         while (cash < tot)
                         {
                             System.out.println("Try Again!!");
                             System.out.println("Enter Your Cash!!");
                             
                             cash = input.nextInt(); 
                         }
                         if (cash >= tot)
                         {
                             int change;
                             change = cash - tot;
                             System.out.println("Your Change Is: " + change);
                         }
                     }
                 
            }
            else
                    {
            System.out.println("Invalid Input");
                    }
        }
        
        if (ch1 >= 3 )
        {
            System.out.println("Invalid Input");
        }
    }
}
