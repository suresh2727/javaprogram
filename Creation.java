import java.util.Scanner;

public class Creation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number for a number creation");
        n =sc.nextInt();
        int b=0;
        for (int i=1 ; i<=n; i++) {
            b = b*10;
            b = b+i;
            System.out.println(b);
        }
    }
}
