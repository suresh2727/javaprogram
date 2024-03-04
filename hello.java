import java.util.Scanner;

public class hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sum of two numbers");
        System.out.println("Enter First number");
        int x = sc.nextInt();
        System.out.println("Enter second number");
        int y = sc.nextInt();
        int z = x + y;
        System.out.println("Sum " + z);

    }

}
