import java.util.Scanner;

public class power_of_a_num {
    public static void main(String [] arg){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter base number: ");
        int num = obj.nextInt();
        System.out.println("Enter power: ");
        int power = obj.nextInt();
        int result = 1;

        for(int i=power; i>=1; i--){
            result *= num;
        }
        System.out.println("The result is " + result);
    }
}
