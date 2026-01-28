public class Main {
    public static void main(String args[]) {
        String szStr1 = "선발투수";
        StringBuffer sbBuffer = new StringBuffer(szStr1);
        sbBuffer.append(' ').append("박찬호"); //한번에 " 박찬호"도 가능
        szStr1 = sbBuffer.toString();
        System.out.println(szStr1);
    }
}
