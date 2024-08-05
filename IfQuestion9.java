
package ifquestion9;
import java.util.Scanner;

public class IfQuestion9 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("Enter the number");
        n1 = input.nextInt();
        System.out.println("Enter the number");
        n2 = input.nextInt();
        System.out.println("Enter the number");
        n3 = input.nextInt();
        int minimum = n1;
        if(minimum>n2)
            minimum = n2;
        if(minimum>n3)
            minimum = n3;
       
        System .out.println("minimum value = " + minimum);
        int maximum = n2;
         if(n1>maximum)
            maximum = n1;
        if(maximum<n3)
            maximum = n3;
      
        System .out.println("maximum value = " + maximum);
    }
    
}
