import java.util.Scanner;
public class average_marks {
    public static void main(String []args)
    {
        float eng, phy, chem, math, comp;
        double average;
        Scanner op=new Scanner(System.in);

        System.out.println("Enter marks of five subjects:");
        System.out.print("Enter marks of English: ");
        eng=op.nextFloat();
        System.out.print("Enter marks of physics: ");
        phy=op.nextFloat();
        System.out.print("Enter marks of chemistry: ");
        chem=op.nextFloat();
        System.out.print("Enter marks of maths: ");
        math=op.nextFloat();
        System.out.print("Enter marks of computers: ");
        comp=op.nextFloat();


        average = ((eng + phy + chem + math + comp) / 5.0);


        if(average >= 90)
            System.out.println("Grade A");
        else if(average <= 80 && average > 70)
            System.out.println("Grade B");
        else if(average <= 70 && average > 60)
            System.out.println("Grade C");
        else if(average <= 60 && average > 50)
            System.out.println("Grade D");
        else if(average < 50)
            System.out.println("FAIL");
        else
            System.out.println("Wrong Input!");

    }
}


