class Student {
    String name = "Dinga";
    int rollNo = 120;

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1);
        System.out.println(s1.name);
        s1.name = "suresh";
        s1.rollNo = 234;
        System.out.println(s1.name + " " + s1.rollNo);

    }
    
}
