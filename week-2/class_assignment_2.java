// Create a new class called Calculator with the following methods:

// 1. A static method called powerInt(int num1, int num2)

// This method should return num1 to the power num2.

// 2. A static method called power Double(double numl, int num2).

// This method should return num1 to the power num2.

// 3. Invoke both the methods and test the functionalities.

// Hint: Use Math.pow(double, double) to calculate the power.



// Bhavya:


// class Calculator{

//     static void powerInt(int num1, int num2) {
//         System.out.println("num1 to the power num2:" +num2**num1);
//     }

//     static void powerDouble(double num1 , int num2) {
//         System.out.println("num1 to the power num2:" +num2**num1);
//     }

//     void calculatePower(){
//         int power = Math.pow(num1,num2);
//         System.out.println("num1 to the power num2:" +power)
//     }
// }

// public class class_assignment_2 {
//     public static void main(String[] args) {
//         Calculator.powerInt
//     }
// }

// Anshika:


//Create a new class called Calculator with the following methods:
//1. A static method called powerInt(int num1, int num2)
//This method should return num1 to the power num2.
//2. A static method called power Double(double numl, int num2).
//This method should return num1 to the power num2.
//3. Invoke both the methods and test the functionalities.
//Hint: Use Math.pow(double, double) to calculate the power.

class Calculator {
    static void powerInt(int num1, int num2) {
        double result = Math.pow(num1, num2);
        int a = (int) result; 
        System.out.println(num1 + " raised to the power of " + num2 + " is: " + a);
    }

    static void powerDouble(double num1, int num2) {
        double result = Math.pow(num1, num2);
        System.out.println(num1 + " raised to the power of " + num2 + " is: " + result);
    }
}

public class Assignment2 {
    public static void main(String[] args) {
        Calculator.powerInt(2, 3);
        Calculator.powerDouble(2.5, 2);
    }
}