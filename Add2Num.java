import java.util.Scanner;

public class Add2Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Num1 declaration and Initilization
        int num1;
        System.out.println("Enter value for 1 num");
        num1 = sc.nextInt();

        //Num2 dclaration and initilization

        int num2;
        System.out.println("Enter value for 2 num");
        num2 = sc.nextInt();

        // Result or calculation part

        int sum;
        sum = num1 + num2;
        System.out.println("Sum = " + sum);




    }
}
