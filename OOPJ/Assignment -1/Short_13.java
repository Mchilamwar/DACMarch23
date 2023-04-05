public class Short_13 {
    public static void main(String[] args) {
        
        short sh=64;

        System.out.println("Short to String "+Short.toString(sh));
        
        
        System.out.println("Short instance of short "+Short.valueOf(sh));

        // String str="64";
        String str=new String("64");

        System.out.println("String instance to Short Instance "+Short.valueOf(str));




    }
}
