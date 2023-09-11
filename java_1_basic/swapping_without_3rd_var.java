public class swapping_without_3rd_var {
    public static void main (String[] arg){
        int a = 15;
        int b = 5;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Swapped numbers are: a = " + a + " ,b = " + b);
    }
}


