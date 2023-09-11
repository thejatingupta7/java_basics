public class reverse_of_num {
    public static void main (String[] arg){
        int num = 1234;
        int a, b, c, d, e, f;
        a = num % 10;
        b = num / 10;
        c = b % 10;
        d = b / 10;
        e = d % 10;
        f = d / 10;
        int rev = a*1000 + c*100 + e*10 +f;
        System.out.println(rev);
    }
}