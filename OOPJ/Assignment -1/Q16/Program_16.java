
public class Program_16 {

    public static void main(String[] args) {
        int i=90;

        Integer in=new Integer(i);

        System.out.println(String.valueOf(i));

        System.out.println(Integer.valueOf(i));

        String str=new String("64");

        System.out.println(Integer.valueOf(str));
        
        System.out.println(Integer.toBinaryString(i));

        System.out.println(Integer.toOctalString(i));

        System.out.println(Integer.toHexString(i));

    
    }

}
