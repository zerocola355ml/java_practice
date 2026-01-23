class MyClass {
    private int nMyField = 0;
    public void setMyField(int nNewField) {nMyField = nNewField;}
    public int getMyField() {return nMyField;}

}

public class Main{
    public static void main(String[] args){
        MyClass myObject1, myObject2;
        myObject1 = new MyClass();
        myObject2 = new MyClass();
        
        myObject1.setMyField(10);
        myObject2.setMyField(20);
        System.out.println(myObject1.getMyField()); //10
        System.out.println(myObject2.getMyField()); //20
    }
    
}
