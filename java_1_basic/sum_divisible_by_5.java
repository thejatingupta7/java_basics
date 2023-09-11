public class sum_divisible_by_5 {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 5 == 0)
                sum = sum + i;
        }
        System.out.println("Sum of numbers between 1 and 1000 divisible by 5 : " + sum);
    }
}
