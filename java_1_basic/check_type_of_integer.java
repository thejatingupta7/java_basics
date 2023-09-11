import java.util.Scanner;

public class check_type_of_integer {
    public static void main(String[] arg) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number to check if it's +ve, -ve or 0 : ");
        int num = obj.nextInt();

        if (num > 0)
            System.out.println(num + " is +ve.");
        else if (num < 0)
            System.out.println(num + " is -ve.");
        else if (num == 0)
            System.out.println(num + " is zero.");
        else
            System.out.println("Invalid Input!");
    }
}