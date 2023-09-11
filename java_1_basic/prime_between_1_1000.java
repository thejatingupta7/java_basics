public class prime_between_1_1000 {
    public static void main(String [] args){

        int count = 0;
        for(int num=1; num<=1000; num++) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }
        }
        System.out.println("Total number of Prime numbers between 1 and 1000: " + count);
    }
}
