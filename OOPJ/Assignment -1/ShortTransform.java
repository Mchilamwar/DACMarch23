public class ShortTransform {
      
 public static void main(String[] args) {
    Short s=64; //Autoboxing

    System.out.println("Short value of Short "+s);

    System.out.println("String value of Short "+Short.toString(s));

    // Short s2=new Byte(b);

    System.out.println("Number of Bytes used to represent "+s.BYTES);

    System.out.println("Number of bits used to represent "+s.SIZE);

    System.out.println("Maximum value for Byte is  "+s.MAX_VALUE);

    System.out.println("Minimum value for Byte is  "+s.MIN_VALUE);

 
 }   
 
}
