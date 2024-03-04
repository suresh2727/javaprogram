import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i,n;
        System.out.println("Enter the value of N to check all the positive Factors");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            if (n%i==0) {
                System.out.print(i+ " ");
            }
        }
       
    }
}
