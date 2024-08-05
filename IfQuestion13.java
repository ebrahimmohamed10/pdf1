
package ifquestion13;
import java.util.Scanner;

public class IfQuestion13 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi=3.14;
        double r,Area;
        System.out.println("Enter redias");
        r = input.nextDouble();
        Area =r*pi*r;
        System.out.println("The area of circle = " + Area);
    }
    
}
