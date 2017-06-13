import static java.lang.System.exit;
import java.util.Scanner;
class ArithmeticOperations
{
    public static void main(String args[])
    {
        System.out.println("Enter Operand 1");
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        System.out.println("Enter Operand 2");
        double b = s.nextDouble();
        while(true)
        {
            System.out.println("*** MENU  ***");
            System.out.println("1.ADD\n2.Subtract\n3.Multiply\n4.Division\n5.EXIT");
            int ch = s.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Addition is :"+(a+b));
                    break;
                case 2:
                    System.out.println("Subtraction is :"+(a-b));
                    break;
                case 3:
                    System.out.println("Multiplication is :"+(a*b));
                    break;
                case 4:
                    System.out.println("Division is :"+(a/b));
                    break;
                case 5:
                    exit(0);
                default:
                    System.out.println("Wrong Option!!!\nTry again...");
            }
        }
        
    }
}