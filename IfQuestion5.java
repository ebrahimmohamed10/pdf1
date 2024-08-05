
package ifquestion5;

import java.util.Scanner;

public class IfQuestion5 {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int number;
       System.out.println("Enter the number");
       number = input.nextInt();
       if(number>0)
          System.out.println("the number is positive");
       else if (number <0)
                System.out.println("the number is negative");
           
        
    }
    
}
