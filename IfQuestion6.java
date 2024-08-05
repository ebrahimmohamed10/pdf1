
package ifquestion6;

import java.util.Scanner;

public class IfQuestion6 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks;
        System.out.println("Enter the marks");
        marks = input.nextInt();
      
       if (marks>=80)
           System.out.println("the grade is A");
       else if (marks>=60)
            System.out.println("the grade is B");
       else if (marks>=40)
            System.out.println("the grade is C");
        else if (marks<40)
            System.out.println("the grade is f");
       else
            System.out.println("invalid grade");
}
    
}
