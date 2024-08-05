
package ifquestion3;
import java.util.Scanner;

public class IfQuestion3 {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       char character;
       System.out.println("Enter the character");
       character = input.next().charAt(0);
       switch(character)
       {
           case 'a' :
               System.out.println("character is vowel");
               break;
           case 'i' :
               System.out.println("character is vowel");
               break;
           case 'o' :
               System.out.println("character is vowel");
               break;
           case 'u' :
               System.out.println("character is vowel");
               break;
           case 'e' : 
               System.out.println("character is vowel");
               break;
           default :
               System.out.println("character is consonant");
               break;
       }
    }
    
}
