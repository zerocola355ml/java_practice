class SharedResource_12_8 {
    int nRes = 0;
    public void incRes(String szThdName) {
        try {
            Thread.sleep(2);
        } catch (Exception e) {System.out.println(e);}
        nRes++;
        System.out.println("[" + szThdName + " " + nRes + "]");
    }
}