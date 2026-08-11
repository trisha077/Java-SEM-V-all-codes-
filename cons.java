class Cons {
    int x, y;

    // single constructor
    Cons(int a) {
        x = a;
    }

    // multiple constructor
    Cons(int a, int b) {
        x = a;
        y = b;
    }

    void show() {
        System.out.println(x + " " + y);
    }

    public static void main(String[] args) {
        Cons a = new Cons(10);
        Cons b = new Cons(10, 20);

        a.show();
        b.show();
    }
}
