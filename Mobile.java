class Mobile {
    String company;
    float size;

    Mobile(String c, float s) {
        company = c;
        size = s;
    }

    void show() {
        System.out.println(company + " " + size + " inch");
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile("Apple", 6.1f);
        Mobile m2 = new Mobile("Samsung", 6.5f);
        Mobile m3 = new Mobile("OnePlus", 6.7f);
        Mobile m4 = new Mobile("Vivo", 6.4f);
        Mobile m5 = new Mobile("Oppo", 6.6f);

        m1.show();
        m2.show();
        m3.show();
        m4.show();
        m5.show();
    }
}
