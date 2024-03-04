import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count , i , n;
        System.out.println("Enter Number to check weather it is prime or Not");
        n =sc.nextInt();
        count = 0;
        for(i=1 ;i<=n;i++){
            if (n%i==0) {
                count++;
            }
            
        }
        if (count==2) {
            System.out.println("Prime");
        }
        else{
            System.out.println("Not a Prime");
        }
        
    }
}
