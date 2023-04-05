class Program_27 {

    public static void main(String[] args) {
        double b=64.0;
    
        System.out.println("Long value of Long "+b);
    
        System.out.println("String value of Long "+Double.toString(b));
    
        Double b2=new Double(b);
    
        System.out.println("Number of Bytes used to represent "+b2.BYTES);
    
        System.out.println("Number of bits used to represent "+b2.SIZE);
    
        System.out.println("Maximum value for Long is  "+b2.MAX_VALUE);
    
        System.out.println("Minimum value for Long is  "+b2.MIN_VALUE);
    
     
     }   
}


