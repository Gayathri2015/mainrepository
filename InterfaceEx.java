interface InterfaceEx {

    public void m1(String source, String destination);
    
}

class Test{
    public static void main(String[] args) {
        
    
    InterfaceEx obj = (source,destination) -> System.out.println("The source is from " + source +  " destination " + destination);
    obj.m1("Hyderabad","America");
}

}

