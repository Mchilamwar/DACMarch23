
public class CharTransform {
    
    public static void main(String[] args) {
       char ch='C';
   
       System.out.println("Byte value of Byte "+ch);
   
        Character ch2=new Character(ch);
   
       System.out.println("Number of Bytes used to represent "+ch2.BYTES); // 2 bytes
   
       System.out.println("Number of bits used to represent "+ch2.SIZE); // 16 bits 
   
       System.out.println("Maximum value for Byte is  "+ch2.MAX_VALUE);// ?
   
       System.out.println("Minimum value for Byte is  "+ch2.MIN_VALUE);//null
   
    
    }   
       
   
   
   
   }