import java.util.Scanner;

public class Hcf_lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter the value of A");
        a=sc.nextInt();
        int b;
        System.out.println("Enter the value of B");
        b=sc.nextInt();
        int hcf=0;
        int i;    
        for(i=1 ; i<=a ; i++ ){
            if (a%i==0 && b%i==0) {
                hcf=i;

            }
        }

        int lcm = 0;
        lcm = (a*b)/hcf; // a*b = lcm * hcf 


        System.out.println("HCF = " + hcf);

        System.out.println("LCM = " + lcm);
    }
}
