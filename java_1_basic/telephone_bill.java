public class telephone_bill {
    public static void main(String[] arg) {
        float min = 300;
        float bill = 0;
        if (min <= 100) {
            bill = (float) (min * 1.00);
        } else if (min > 100 && min <= 200) {
            bill = (float) (100 + ((min - 100) * 1.20));
        } else if (min > 200 && min <= 300) {
            bill = (float) (100 + ((min - 100) * 1.20) + ((min - 200) * 1.50));
        } else if (min > 300) {
            bill = (float) (100 + ((min - 100) * 1.20) + ((min - 200) * 1.50) + ((min - 300) * 1.80));
        }
        System.out.println("Bill is: " + bill);
    }
}