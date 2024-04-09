// print true if the non-negative int values have same last digit otherwise false


public class thirdB {
    public static void main(String args[]) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int r1 = num1%10;
        int r2 = num2%10;

        if(r1 == r2){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}