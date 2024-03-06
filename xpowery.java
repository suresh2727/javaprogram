import java.util.Scanner;

public class xpowery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Enter the value of x");
        x = sc.nextInt();
        int y;
        System.out.println("Enter the value of y");
        y = sc.nextInt();
        int ans = 1;
        for (int i = 1; i <= y; i++) { 
            ans = ans * x; // 1*3 = 3 // 3*3 = 9 //  9*3 =27
        }
        System.out.println(ans);
    }
}
