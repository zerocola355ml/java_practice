public class Main {
    public static void main(String args[]) {
        String szStr1 = "test string";
        StringBuffer sb = new StringBuffer(szStr1);
        sb.reverse();
        szStr1 = sb.toString();
        System.out.println(szStr1);
    }
}
