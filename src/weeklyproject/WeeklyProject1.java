/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weeklyproject;

import java.util.Scanner;

/**
 *
 * @author Ηλίας
 */
public class WeeklyProject1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
            float num1 = 0; float num2 = 0;
            boolean x = true; boolean y = true;
            
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Type a number, and then press Enter");
            num1 = sc.nextInt();
            System.out.println("Type another number, and then press Enter");
            num2 = sc.nextInt();
            System.out.println("Type a boolean true or false ");
            x = sc.nextBoolean();
            System.out.println("Type a boolean true or false");
            y = sc.nextBoolean();
            
            if (x == false && y == false){                                           //1st question (Both false)
                System.out.println("The sum of num1 and num2 = " + (num1 + num2));
            }
            else if (x == true && y == true){                                        //2nd question (Both true)
                System.out.println("Try again!");
            }
            else if (x == false && y == true){                                       //3rd question (At least one false)
                System.out.println("Num2 - Num1 = " + (num2 - num1));
            }
            else if (x == true && y == false){
                System.out.println("Num2 - Num1 = " + (num2 - num1));
            }
            if (x == false && y == true){                                            /*4th question (1st boolean false
                                                                                                     1st number>20)   */
                while(num1 > 20){
                System.out.println("Num1 * Num2 = " + (num1 * num2));
                break;}                
            }
            if (x == false && y == true){
                while(num1 <= 20){
                System.out.println("Num1 * Num2 = " + (num2 / num1));
                break;}
            }
            float sum = num1 + num2;
            if ((y == true) && ((sum > 44) && (num2 % num1 == 0))){                  //5th question
                System.out.println("What the fuck!");
            }
    }
    
}
