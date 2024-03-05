public class Calc {
    void add(int a, double b){
        double sum = a+b;
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        Calc c = new Calc();
        c.add(10,22.25);
        
    }
}
