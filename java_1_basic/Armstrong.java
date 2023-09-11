public class Armstrong {
    public static void main(String [] arg){
        int num = 153;
        int a = num % 10;
        int b = num / 100;
        int c = (num % 100)/10;
        int armstrong_num = (a*a*a)+ (b*b*b) + (c*c*c);
        if(num == armstrong_num){
            System.out.println("Number is Armstrong.");
        }
        else {
            System.out.println("Number is not Armstrong.");
        }
    }
}
