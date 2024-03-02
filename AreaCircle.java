import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        System.out.println("Enter radius");
        r = sc.nextInt();
        double area;
        area = 3.14 * r *r ;
        System.out.println("Area of Circle = " + area);


    }
}
