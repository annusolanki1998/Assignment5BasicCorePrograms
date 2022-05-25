
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int num;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number");
        num = s1.nextInt();
        if(num%2==0)
            System.out.println("Even no");
        else
            System.out.println("odd no");

    }

}
