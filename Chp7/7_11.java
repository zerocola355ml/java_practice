public class Main {
    public static void main(String args[]) {
        String szStr1 = "test";
        String szStr2 = "test";
        if(szStr1.equals("test"))
            System.out.println("szStr1과 szStr2는 같다."); //이건 같다. 
        else
            System.out.println("szStr1과 szStr2는 다르다.");
        
        String szStr3 = new String("test");
        if(szStr1.compareTo(szStr3) == 0)
            System.out.println("szStr1과 szStr3는 같다."); //이것도 같다.
        else
            System.out.println("szStr1과 szStr3는 다르다.");
    }
}
