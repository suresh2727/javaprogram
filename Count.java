package program;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to find the total numbers of Capital letter , small letters , special char and words");
        char[] a = sc.nextLine().toCharArray();

        int cp=0;
        int sm=0;
        int d=0;
        int space=0;
        int sp=0;
        int w=0;
        for (char i : a) {
            if (i>=65 && i<=90) {
                cp++;
                System.out.println(a[0]);
                System.out.println(i);
            }
            else if (i>=97 && i<=122) {
                sm++;
            }
            else if (i>=48 && i<=57) {
               d++; 
            }
            else if (i == 32) {
                space++;
            }
            else{
                sp++;
            }
        }

        w = space+1;
        System.out.println("Digit = " + d);
        System.out.println("Capital letter = " + cp);
        System.out.println("Small letter = " + sm);
        System.out.println("Special letter = " + sp);        
        System.out.println("Words = " + w); 
        System.out.println("Space = " + space); 
    }

    
}
