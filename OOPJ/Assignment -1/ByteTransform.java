
public class ByteTransform {
    
 public static void main(String[] args) {
    byte b=64;

    System.out.println("Byte value of Byte "+b);

    System.out.println("String value of Byte "+Byte.toString(b));

    Byte b2=new Byte(b);

    System.out.println("Number of Bytes used to represent "+b2.BYTES);

    System.out.println("Number of bits used to represent "+b2.SIZE);

    System.out.println("Maximum value for Byte is  "+b2.MAX_VALUE);

    System.out.println("Minimum value for Byte is  "+b2.MIN_VALUE);

 
 }   
    



}