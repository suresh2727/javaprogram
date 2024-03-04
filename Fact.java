import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long fact,i,n;

        fact = 1;
        System.out.println("Enter the number to Get Factorial");
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            fact = fact *i;
        }
        System.out.println("Factorial of "+ n + " = " + fact);
    }
}
