import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
        char vowel[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        Scanner s1 = new Scanner(System.in);
        System.out.print("Input a character: ");
        char c = s1.next().charAt(0);
        System.out.println("You have entered " + c);
        for (int i = 0; i <= 9; i++) {
            if (c == vowel[i]) {
                System.out.println("Vowel");
                System.exit(0);
            }
        }
        System.out.println("Consonant");

    }
}
