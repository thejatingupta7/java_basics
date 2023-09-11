import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number of terms : ");
        int num = obj.nextInt();

        int prev = 0;
        int current = 1;
        System.out.println(prev);
        System.out.println(current);
        for(int i=1; i<=num ; i++){
            int next = prev+current;
            prev=current;
            current=next;
            System.out.println(next);
        }

    }
}
