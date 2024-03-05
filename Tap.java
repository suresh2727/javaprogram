class Tap{
    Water tapOn(){
        Water w = new Water();
        System.out.println("TapOn return Water");
        return w;
    }

    class Water{

    }

    public static void main(String[] args) {
        Tap t = new Tap();
        t.tapOn();
    }
}