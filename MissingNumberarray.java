package program;

import java.util.Scanner;

public class MissingNumberarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n;
        n = sc.nextInt();

        System.out.println("Enter the array elements");
        int i;
        int[] a = new int[n-1];
        for (i = 0; i <= n-2; i++) {
            a[i] = sc.nextInt();
        }

        int sum1=0;
        int sum2=0;
        for(i=1 ; i<=n ; i++){
            sum1 = sum1 + i; 
        }
        // System.out.println(sum1);
        
        for(i=0 ; i<=a.length-1 ; i++){
            sum2 = sum2 + a[i];  
        }
        // System.out.println(sum2);
        int missing = sum1-sum2;
        
        System.out.println("Missing Number is = " + missing );
    }

}
