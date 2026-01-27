public class Main {
    public static void main(String args[]) {
        int i = 5 / 0;  //ArithmeticException
        System.out.println(i);
        
        int[] a = new int[5];
        a[6] = 10; //ArraryIndexOutOfBoundsException
    }
}
