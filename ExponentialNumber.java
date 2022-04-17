import java.util.Scanner;

public class ExponentialNumber {
    public static void main(String[] args) {
        int no;
        int exp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Base Number:  ");
        no = input.nextInt();
        System.out.print("Enter Exponent Number:  ");
        exp = input.nextInt();

        int total = 1;

       /* while (i < exp) {
           total *= no;
            i++;
        }*/
        //System.out.println("Result: "+total);

        for (int i=1; i <= exp;)
        {
         total *= no;
         i++;
        }
        System.out.println("Result:  "+total);

    }
}
