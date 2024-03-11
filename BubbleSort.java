import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of Array");
        n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the array elements to sorted");
        int i;
        for (i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Sorted array is ");
        int j;
        for (j = 0; j <= a.length - 1; j++) {
            for (i = 0; i <= a.length - 2; i++) {
                if (a[i] > a[i + 1]) {
                    a[i] = a[i] + a[i + 1];
                    a[i + 1] = a[i] - a[i + 1];
                    a[i] = a[i] - a[i + 1];
                }
            }

        }

        for (i = 0; i <= a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
