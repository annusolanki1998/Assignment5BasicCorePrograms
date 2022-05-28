import  java.util.Scanner;
public class PowerOf {
    public static void main(String[] args) {
        int result = 1 ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Base");
        int base = scanner.nextInt();
        System.out.println("Enter Power");
        int power = scanner.nextInt();
        for(int i = 1; i<=power; i++)
        {
            result = result*base;
        }
        System.out.println("Result is: " +result);


    }
}
