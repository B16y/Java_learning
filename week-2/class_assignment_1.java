// create a class box that uses a parameterized constructor to initialize the dimensions of a box. The dimensions of the box are width, height, depth. The class should have a method that can return the volume of the box. Create an object of the box class and test the functionalities.


//create a class box that uses a parameterized constructor to initialize the dimensions of a box. The dimensions of the box are width, height, depth. The class should have a method that can return the volume of the box. Create an object of the box class and test the functionalities.


class Box {
    int w;
    int h;
    int d;

    Box(int a, int b, int c) {
        w = a;
        h = b;
        d = c;
        calculateVolume();
    }

    void calculateVolume() {
        int volume = w * h * d;
        System.out.println("The volume is: " + volume);
    }
}

public class Assignment1 {
    public static void main(String[] args) {
        Box s1 = new Box(1, 2, 9);
    }
}