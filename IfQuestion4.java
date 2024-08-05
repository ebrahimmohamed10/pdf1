
package ifquestion4;

import java.util.Scanner;

public class IfQuestion4 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter the first n1");
         System.out.println("Enter the first n2");
         n1 = input.nextInt();
         n2 = input.nextInt();
         char symbol;
         symbol = input.next().charAt(0);
         switch(symbol)
         {
             case '+' :
                 System.out.println("The result = " + (n1+n2));
                 break;
             case '-' :
                 System.out.println("The result = " + (n1-n2));
                 break;
             case '*' :
                 System.out.println("The result = " + n1*n2);
                 break;
             case '/' :    
                 System.out.println("The result = " + (n1/n2));
                 break;
         }
    }
    
}
