public class BooleanTransform 
{
    public static void main(String[] args) {
        boolean bool=true;

        System.out.println("String value of boolean "+String.valueOf(bool));

        Boolean Inst_bool=new Boolean(bool);

        System.out.println("Instance value of boolean "+Inst_bool);//to_string()

        String str="true";

        System.out.println("Boolean Instance of String "+Boolean.parseBoolean(str));

        System.out.println("Boolean Value of String "+Boolean.valueOf(str));//String Instance to Boolean instance

        
    }
}
