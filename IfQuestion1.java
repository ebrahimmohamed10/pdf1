
package pkgif.question.pkg1;

import java.util.Scanner;

public class IfQuestion1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int monthnumber;
        System.out.println("Enter the number of the month");
        monthnumber = input.nextInt();
        switch(monthnumber)
        {
            case 1 :
                System.out.println("The month name is january");
                break;
            case 2 : 
                System.out.println("The month name is february");
                break;
            case 3 :
                System.out.println("The month name is march");
                break;
            case 4 :
                System.out.println("The month name is april");
                break;
            case 5 :
                System.out.println("The month name is may");
                break;
            case 6 :
                System.out.println("The month name is june");
                break;
            case 7 :
                System.out.println("The month name is july");
                break;
            case 8 :
                System.out.println("The month name is august");
                break;
            case 9 :
                System.out.println("The month name is september");
                break;
            case 10 :
                System.out.println("The month name is october");
                break;
            case 11 :
                System.out.println("The month name is november");
                break;
            case 12 : 
                System.out.println("The month name is december");
                break;
            default :
                System.out.println("This invalid value");
                break;
        }
        
    }
    
}
