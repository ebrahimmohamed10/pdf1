
package ifquestion8;

import java.util.Scanner;

public class IfQuestion8 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float n1, n2, n3;
        System.out.println("Enter n1");
        n1 = input.nextFloat();
        System.out.println("Enter n2");
        n2 = input.nextFloat();
        System.out.println("Enter n3");
         n3 = input.nextFloat();
       
        if(n1>n2)
            
         if(n1>n3)  
             
         if(n3>n2)
              
        System.out.println("Sorted numbers = " );
        System.out.println(n1);
        System.out.println(n3);
        System.out.println(n2);
    }
    
}
