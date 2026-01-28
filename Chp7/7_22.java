public class Main {
    public static void main(String args[]) {
        final String tmp = "abcde";
        long start, end;
        
        System.out.println("String, StringBuffer, StringBuilder 속도 비교");
        String str = new String();
        StringBuffer sb = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();
        
        start = System.nanoTime();
        for(int i = 0; i < 10000; i++) str = str + tmp;
        end = System.nanoTime();
        System.out.println();
        System.out.println("String : " + (end - start)/1000000.0 +" msecs");
        
        start = System.nanoTime();
        for(int i = 0; i < 10000; i++) sb.append(tmp);
        end = System.nanoTime();
        System.out.println();
        System.out.println("StringBuffer : " + (end - start)/1000000.0 +" msecs");
        
        start = System.nanoTime();
        for(int i = 0; i < 10000; i++) sb2.append(tmp);
        end = System.nanoTime();
        System.out.println();
        System.out.println("StringBuilder : " + (end - start)/1000000.0 +" msecs");
    }
}

/*
String, StringBuffer, StringBuilder 속도 비교

String : 139.671203 msecs

StringBuffer : 3.729305 msecs

StringBuilder : 1.911993 msecs

*/
