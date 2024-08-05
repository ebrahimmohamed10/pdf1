
package ifquestion12;

import java.util.Scanner;

public class IfQuestion12 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("Enter number1");
        n1 = input.nextInt();
          System.out.println("Enter number2");
        n2 = input.nextInt();
          System.out.println("Enter number3");
        n3 = input.nextInt();
        int greatestnumber =n1;
        if(n2>greatestnumber)
            greatestnumber = n2;
                    if(n3>greatestnumber)
                        greatestnumber = n3;
                    System.out.println("The greatest number is " + greatestnumber );
    }
    
}
