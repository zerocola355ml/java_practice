public class Main {
    public static void main(String args[]) {
        final String aValue = "abcde";
        String str = new String();
        
        for(int i = 0; i < 10000; i++)
            str = str + aValue;
    }
}
/*
기존 str은 메모리에 그대로 두고, 
변경된 새로운 문자열로 새로운 String 객체를 생성한 후에 
다시 str 객체 변수에 대입한다. 
그만큼 메모리를 낭비한다. 
*/
