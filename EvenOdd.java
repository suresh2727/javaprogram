import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter number to find it is even or odd");
        number = sc.nextInt();

        if (number%2==0) {
            System.out.println(number +" is even");
        }
        else{
            System.out.println(number + " is odd");
        }
    }
}