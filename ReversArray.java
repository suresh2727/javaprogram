import java.util.Scanner;

public class ReversArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the Array Elements");
        n = sc.nextInt();
        int[] a = new int[n];
        int i;
        System.out.println("Enter the array elements");
        for (i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Reverse Array is:");
        int j;
        for (i = 0, j = a.length - 1; i < j; i++, j--) {
            a[i] = a[i] + a[j];
            a[j] = a[i] - a[j];
            a[i] = a[i] - a[j];
        }

        for (i = 0; i <= a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }

    }

}
