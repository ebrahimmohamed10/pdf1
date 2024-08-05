
package ifquestion2;

import java.util.Scanner;

public class IfQuestion2 {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int monthnumber;
       System.out.println("Enter the number of the month");
       monthnumber = input.nextInt();
       switch(monthnumber)
       {
           case 12 : 
           case 1 :
           case 2 :   
               System.out.println("The month is in winter");
               break;
           case 9 : 
           case 10 :
           case 11 :   
               System.out.println("The month is in autumnn");
               break;
           case 3 : 
           case 4 :
           case 5 :   
               System.out.println("The month is in spring");
               break;
           case 6 : 
           case 7 :
           case 8 :   
               System.out.println("The month is in summer");
               break;
    
           default :
               System.out.println("This is invalid value");
               break;

    
       }
    }
    
}
