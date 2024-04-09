  // class declaration for point 

// class Point{
//     private int x;
//     private int y;
//     public void setX(int x){
//         // this.x = (x > 79 ? 79 : (x < 0 ? 0 : x));
//         x = (x > 79 ? 79 : (x < 0 ? 0 : x));
//     }
//     public void setY(int y){
//         // this.y = (y >24 ? 24 : ( y< 0 ? 0 : y));
//         y = (y >24 ? 24 : ( y< 0 ? 0 : y));
//     }
//     public int getX(){
//         return x;
//     }
//     public int getY(){
//         return y;
//     }
// }

// class PointDemo{
//     public static void main(String args[]){
//         int a,b;
//         Point p1 = new  Point();
//         p1.setX(22);        
//         p1.setY(44);  
//         a = p1.getX();
//         System.out.println("The value of a is" +a);
//         b = p1.getY();
//         System.out.println("The value of b is" +b);      
//     }
// }


class Point{
    private int x;
    private int y;
    
    public void setX(int x){
        // Use "this.x" to refer to the instance variable
        this.x = (x > 79 ? 79 : (x < 0 ? 0 : x));
    }
    
    public void setY(int y){
        // Use "this.y" to refer to the instance variable
        this.y = (y > 24 ? 24 : (y < 0 ? 0 : y));
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
}

class encapsulation_and_abstraction{
    public static void main(String args[]){
        int a,b;
        Point p1 = new  Point();
        p1.setX(22);        
        p1.setY(44);  
        a = p1.getX();
        System.out.println("The value of a is " + a);
        b = p1.getY();
        System.out.println("The value of b is " + b);      
    }
}