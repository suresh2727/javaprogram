import java.util.Scanner;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum , i, n;
        sum = 0;
        System.out.println("Enter the N value to calculate sum of all that number");
        n =sc.nextInt();
        for(i=1 ; i<=n;i++){
            sum = sum + i;
        }
        System.out.println("sum = " + sum);
    }
}
