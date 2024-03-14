import java.util.Scanner;

public class PickNeighbour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the array elements");
        int i;
        for(i=0 ; i<=a.length-1 ; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Picked neighbours are");
        for(i =1 ; i<=a.length-2 ; i++){
            if(a[i]>a[i+1] && a[i]>a[i-1]){
                System.out.print(a[i] + " ");
            }
        }
        
    }
}
