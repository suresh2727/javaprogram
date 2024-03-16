package program;

import java.util.Scanner;

public class char1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to find Vowels and ");
        char[] a = sc.nextLine().toCharArray();
        
        int vowels = 0;
        int c = 0;
        int i;
        for (i=0; i<=a.length-1 ; i++) {
            a[i] = Character.toUpperCase(a[i]); 
        }
        for (i = 0; i <= a.length-1; i++) {
            if (a[i]!= ' ') {
                if (a[i] == 'A' || a[i] == 'E' || a[i] == 'I' || a[i] == 'O' || a[i] == 'U') {
                    vowels++;
                   
                } 
                else{
                    c++;
                }
            }
        }
        System.out.println("Total  vowels Found are " + vowels);
        System.out.println("Total consonants are " + c);

    }
}
