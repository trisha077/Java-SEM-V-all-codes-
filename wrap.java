class Wrap {
    public static void main(String[] args) {

        int a = 10;

        // primitive to object
        Integer obj = Integer.valueOf(a);

        // object to primitive
        int b = obj.intValue();

        System.out.println("Object = " + obj);
        System.out.println("Primitive = " + b);
    }
}
