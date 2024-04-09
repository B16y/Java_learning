class quiz1{
    int i_val = 10;
    Sample(int i_val){
        this.i_val = i_val;
        System.out.print("inside Sample i_val:" +this.i_val);
    }
    public static void main(String[] xyz){
        Sample o = new Sample();
    }
}