import java.util.Scanner;
public class check_prime {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number to check if it's prime or not: ");
        int num = obj.nextInt();

        int count = 0;
        for(int i = 2; i<num ; i++){
            if(num % i == 0){
                count++;
                break;
            }
        }
        if(count == 0)
            System.out.println(num + " is prime.");
        else
            System.out.println(num + " is NOT prime.");
    }
}
