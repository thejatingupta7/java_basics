import java.util.Scanner;

public class strong_number {
    public static void main(String[] arg) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number to check if it's strong or not: ");
        int num = obj.nextInt();
        int org_num = num;
        int strong = 0;
        int digit;

        while(num > 0) {
            digit = num % 10;

            int fact = 1;
            for (int i = 1; i <= digit; i++)
                fact = fact * i;
            strong += fact;

            num = num / 10;
        }

        if(org_num == strong)
            System.out.println( org_num +" is a strong number.");
        else
            System.out.println( org_num +" is not a strong number.");

    }
}