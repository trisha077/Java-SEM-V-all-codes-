class Cube {
    int l, b, h;

    Cube() {
        l = b = h = 1;
    }

    Cube(int x) {
        l = b = h = x;
    }

    Cube(int x, int y, int z) {
        l = x;
        b = y;
        h = z;
    }

    void vol() {
        System.out.println("Volume = " + (l * b * h));
    }

    public static void main(String[] args) {
        Cube c1 = new Cube();
        Cube c2 = new Cube(2);
        Cube c3 = new Cube(2, 3, 4);

        c1.vol();
        c2.vol();
        c3.vol();
    }
}
