public class Main {
  public static void main(String args[]) {
      int nSrc[] = {1, 2, 3, 4, 5};
      int nTar[] = new int[nSrc.length];
      System.arraycopy(nSrc, 0, nTar, 0, nSrc.length);
  }
}
