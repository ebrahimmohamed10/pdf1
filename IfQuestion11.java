
package ifquestion11;
import java.util.Scanner;


public class IfQuestion11 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int num;
       int positivesum = 0,negativesum = 0;
        for (int i = 1; i <= 6; i++) {
            System.out.println("Enter the number" + i);
            num = input.nextInt();
            if(num>0)
            positivesum+=num;
            else
                negativesum+=num;
            
        }
        System.out.println("positivesum = " + positivesum );
         System.out.println("negativesum = " + negativesum );
    }
    
}
