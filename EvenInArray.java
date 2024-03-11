import java.util.Scanner;

public class EvenInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of an array");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements to find even numbers");
        int i;
        for (i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Even array elements are");
        for (i = 0; i <= a.length - 1; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i] + " ");

            }
        }

    }
}
