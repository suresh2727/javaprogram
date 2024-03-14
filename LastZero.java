import java.util.Scanner;

public class LastZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of Array");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements to sort the array");
        int i;
        for (i = 0; i <= a.length-1; i++) {
            a[i] = sc.nextInt();
        }
        int j = 0;
        
        for (i = 0; i <= a.length-1; i++) {
            if (a[i] != 0) {
                a[j] = a[i];
                j++;
            }
        }
        while (j<=a.length-1) {
            a[j] = 0;
            j++;

        }

        for (j = 0; j <= a.length-1; j++) {
            System.out.print(a[j] + " ");
        }

    }
}
