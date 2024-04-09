// public class this_reference2 {
//     this_reference1(){
//         this("Java");
//         System.out.println("Default constructor");
//     }
//     Sample(String str){
//         System.out.println("One argument constructor" + str);
//     }
// }



// public class this_reference1 {
//     this_reference1(){
//         this("Java");
//         System.out.println("Default constructor");
//     }
//     this_reference1(String str){
//         System.out.println("One argument constructor: " + str);
//     }
    
//     public static void main(String[] args) {
//         // Creating an object of this_reference1 class will invoke the constructors
//         this_reference1 obj = new this_reference1();
//     }
// }


class Sample {
    Sample(){
        this("Java");
        System.out.println("Default Constructor ");
    }
    Sample(String str){
        System.out.println("One Argument Constructor : "+str);
    }    
}

public class this_reference2 {
    public static void main(String[] args) {
        Sample s1 = new Sample();
        Sample s2 = new Sample("Hello");
    }
}