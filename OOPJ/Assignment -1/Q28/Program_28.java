public class Program_28 {

    public static void main(String[] args) {
        double i=90.0;

        Double in=new Double(i);

        System.out.println(String.valueOf(i));

        System.out.println(Double.valueOf(i));

        String str=new String("64");

        System.out.println(Double.valueOf(str));
        
        System.out.println(Long.toBinaryString(Double.doubleToLongBits(i)));

        System.out.println(Long.toOctalString(Double.doubleToLongBits(i)));

        System.out.println(Long.toHexString(Double.doubleToLongBits(i)));

    
    }
}
