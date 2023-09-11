import java.util.Scanner;
public class arithmetic_calculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = obj.nextInt();
        System.out.println("\nChoose a number:\n1.Addition\n2.Subtraction\n3.Multiply\n4.Divide");
        int op = obj.nextInt();
        System.out.println("\nEnter other number: ");
        int num2 = obj.nextInt();

        if(op==1)
            System.out.println(num1+num2);
        else if(op==2)
            System.out.println(num1-num2);
        else if(op==3)
            System.out.println(num1*num2);
        else if(op==4)
            System.out.println(num1/num2);
        else
            System.out.println("WRONG INPUT!");
    }
}