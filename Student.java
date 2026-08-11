public class Student {
    String name, dept;
    int roll, m1, m2, m3;

    Student(String n, int r) {
        name = n;
        roll = r;
    }

    Student(String n, int r, String d, int a, int b, int c) {
        name = n;
        roll = r;
        dept = d;
        m1 = a;
        m2 = b;
        m3 = c;
    }

    void show() {
        int total = m1 + m2 + m3;
        double per = total / 3.0;

        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Department: " + dept);
        System.out.println("Percentage: " + per + "%");
    }

    public static void main(String[] args) {
        Student s = new Student("Rahul", 10, "CSE", 80, 75, 90);
        s.show();
    }
}
