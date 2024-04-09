class StaticBlockExample {
    // constructor
    StaticBlockExample(){

    System.out.println("Within constructor");

    }
    // block
    static {
        System.out.println("Within 1st static block");
    }
    // method
    static void m1() {
        System.out.println("Within static m1 method");
    }
    //block
    static {
        System.out.println("Within 2nd static block");
        m1();
    }

    public static void main(String[] args) {
        System.out.println("Within main");
        // StaticBlockExample x = new StaticBlockExample();
    }
    static {
        System.out.println("Within 3rd static block");
    }
}