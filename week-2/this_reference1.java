class Sample{
    private int id;
    Sample(){
        id = 101;
        System.out.println("Default constructor, with ID: "+id);
    }
    Sample(int id){
        this.id = id;
        System.out.println("One argument constructor, with ID:" +id);
    }
}
public class this_reference1 {
    public static void main(String[] args){
        Sample s1 = new Sample();
        Sample s2 = new Sample(102);
    }
}