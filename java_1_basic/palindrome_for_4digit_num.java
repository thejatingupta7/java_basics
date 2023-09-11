public class palindrome_for_4digit_num {
    public static void main (String[] arg){
        int num = 1221;
        int a, b, c, d, e, f;
        a = num % 10;
        b = num / 10;
        c = b % 10;
        d = b / 10;
        e = d % 10;
        f = d / 10;
        int rev = a*1000 + c*100 + e*10 +f;
        if(rev == num){
            System.out.println("Number is Palindrome: " + num);
        }
        else{
            System.out.println("Number is not Palindrome: " + num);
        }
    }
}