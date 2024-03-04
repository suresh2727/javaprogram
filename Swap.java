import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the Value of A");
        a=sc.nextInt();
        System.out.println("Enter the value of B");
        b=sc.nextInt();

        a=a+b; //suppose a=10 , b=20 then  a=30
        b=a-b; // suppose a=30 , b=20 then b=10 which is a B swaped successfully
        a=a-b; // suppose a=30 , b=10 then a=20 which is the value of B

        System.out.println("Swaped value are " + "A = " + a + " B = " + b);
    }
}
