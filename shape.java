public class Shape {
    String type;
    double a, b;

    Shape(String t, double x) {
        type = t;
        a = x;
    }

    Shape(String t, double x, double y) {
        type = t;
        a = x;
        b = y;
    }

    Shape(Shape s) {
        type = s.type;
        a = s.a;
        b = s.b;
    }

    void area() {
        if (type.equals("Circle"))
            System.out.println("Area = " + 3.14 * a * a);
        else if (type.equals("Square"))
            System.out.println("Area = " + a * a);
        else if (type.equals("Rectangle"))
            System.out.println("Area = " + a * b);
    }

    public static void main(String[] args) {
        Shape c = new Shape("Circle", 5);
        Shape r = new Shape("Rectangle", 4, 6);
        Shape s = new Shape(r);

        c.area();
        r.area();
        s.area();
    }
}
