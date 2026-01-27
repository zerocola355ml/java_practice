class MyResource {
    private String name;
    
    public MyResource(String name) {
        this.name = name;
        System.out.println("[MyResource(" + name + ") open]");
    }
    
    public String read(boolean flag) {
        if(flag) {
            System.out.println("[MyResource(" + name + ") read]");
            return "100";
        } else {
            System.out.println("[MyResource(" + name + ") read]");
            return "abc";
        }
    }
    
    public String getName() {
        return this.name;
    }
    
    public void close() {
        System.out.println("[MyResource(" + name + ") close]");
    }
}
