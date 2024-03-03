import java.util.Scanner;

public class SwitchClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator Program");
        System.out.println("1.ADD  2.SUB 3.MUL 4.DIV");
        System.out.println("Enter a Choice");
        int ch;
        ch = sc.nextInt();
        System.out.println("Enter the value for first");
        int a;
        a = sc.nextInt();
        System.out.println("Enter the value for second");
        int b;
        b = sc.nextInt();

        int ans;

        switch (ch) {    // Default it check ch == 1 it has double equal to 
            case 1: ans = a+b;
                    System.out.println("Ans = " + ans);
                
                break;
            case 2: ans = a-b;
            System.out.println("Ans = " + ans);
            break;

            case 3: ans = a*b;
            System.out.println("Ans = " + ans);
            break;

            case 4: ans = a/b;
            System.out.println("Ans = " + ans);
            break;

        
            default: System.out.println("Invalid Choice");
                break;
        }
       

    }
}
