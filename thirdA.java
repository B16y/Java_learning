public class thirdA {
    public static void main(String args[]) {
        int num = Integer.parseInt(args[0]);
        // System.out.println("Enter the number :");

        
        if(num > 0) {
            System.out.println("Positive Number");
        }

        else if(num < 0){
            System.out.println("Negative Number");
        }

        else{
            System.out.println("Zero");
        }
    }
}