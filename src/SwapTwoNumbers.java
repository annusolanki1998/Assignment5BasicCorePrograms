import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int num1,num2,temp;
        System.out.println("Enter num1");
        num1 = s1.nextInt();

        System.out.println("Enter num2");
        num2 = s1.nextInt();

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping");
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
    }
}
