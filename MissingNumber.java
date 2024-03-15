import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array");
        n = sc.nextInt();

        int[] a = new int[n-1];
        System.out.println("Enter the elements");
        int i;
        for(i=0; i<=a.length-1 ; i++){
            a[i] = sc.nextInt();
        }

        int sum1 =0;
        for(i=1 ; i<=n ; i++){
            sum1 = sum1+i;

        }
        int sum2 = 0;


        for(i =0 ; i<=a.length-1 ; i++){
            sum2 = sum2+a[i];

        }

        System.out.println("Missing Number= " + (sum1-sum2));





    }
}
