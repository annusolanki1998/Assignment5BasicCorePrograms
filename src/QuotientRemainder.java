import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        float num1,num2;
        float rem,quotient;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number1");
        num1=s.nextInt();

        System.out.println("Enter the number2");
        num2=s.nextInt();
        rem=num1%num2;
        quotient=num1/num2;
        System.out.println("Remainder is "+rem);
        System.out.println("Quotient is "+quotient);
    }
}
