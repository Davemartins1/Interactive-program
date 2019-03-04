/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interactive.program;
import java.util.Scanner;
/**
 *
 * @author Engr. Kadir
 */
public class InteractiveProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Username;
        String EnterNumber;
     
        Username = "dammy";
        EnterNumber = "numbers";
    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter Username : ");
    String username = input1.next();

    System.out.println(" Welcome " + username);
    
    Scanner input2 = new Scanner(System.in);
    System.out.println("Enter Number : ");
    int number = input2.nextInt();
   
   // long j = 1;
  // for(int i = 1; i <= 21; i++){
    
   // j *= i;

     
  // Scanner input3 = new Scanner(System.in);
      // System.out.println(j);
  if(number < 20){
      System.out.println(number+" is a invalid input");
  }
  else{
      //System.out.println(number+" is invalid  nor valid");
       
     //int x;
     // System.out.println("Enter an integer to check if it is odd or even");
     // Scanner in = new Scanner(System.in);
     // x = in.nextInt();
     
      if (number % 2 == 0)
         System.out.println("The number is even.");
      else
         System.out.println("The number is odd.");
               
    }
 
    }
}