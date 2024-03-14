import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the sequence of Number");
        n = sc.nextInt();
        int[] a = new int[n];
        a[0] = 0;
        a[1] = 1;

        System.out.println("Fibonacci is");
        int i;
        for(i=2 ; i<=a.length-1 ; i++){
            a[i] = a[i-1] + a[i-2];
        }

        for(i=0 ; i<a.length-1 ; i++){
            System.out.print(a[i] +" " );
        }


    }


}
