
class Program_20 {

    public static void main(String[] args) {
        long i=90;

        Long in=new Long(i);

        System.out.println(String.valueOf(i));

        System.out.println(Long.valueOf(i));

        String str=new String("64");

        System.out.println(Long.valueOf(str));
        
        System.out.println(Long.toBinaryString(i));

        System.out.println(Long.toOctalString(i));

        System.out.println(Long.toHexString(i));

    
    }

}

