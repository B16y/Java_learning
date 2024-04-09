class Sample{
    private int id;
    Sample(){
        id = 101;
        System.out.println("Default constructor, with ID: "+id);
    }
    Sample(int no){
        id = no;
        System.out.println("One argument constructor, with ID:" +id);
    }
}
public class constructor1 {
    public static void main(String[] args){
        Sample s1 = new Sample();
        Sample s2 = new Sample(102);
    }
}