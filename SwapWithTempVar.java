import java.util.Scanner;

public class SwapWithTempVar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,temp;
        temp = 0;
        System.out.println("Enter the value of A");
        a=sc.nextInt();
        System.out.println("Enter the value of B");
        b=sc.nextInt();

        temp=a;
        a=b;
        b=temp;

        System.out.println(a + " " + b);



    }
}
