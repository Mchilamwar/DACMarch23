import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
class DateFormat{
    public static void main(String[] args) throws Exception{

        SimpleDateFormat Sd=new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc=new Scanner(System.in);

        int day;
        int month;
        int year;

        System.out.println("Enter the Day dd :");
        day=sc.nextInt();
        System.out.println("Enter the Month mm :");
        month=sc.nextInt();
        System.out.println("Enter the Year yyyy :");
        year=sc.nextInt();
        

        String date=day+"/"+month+"/"+year;

        Date D=Sd.parse(date);


        // System.out.println(D.getYear()+1900);

        // Date date = new Date();
        //SimpleDateFormat sdf = new SimpleDateFormat( "dd-MM-yyyy");
        //SimpleDateFormat sdf = new SimpleDateFormat( "dd/MMM/yyyy");
        SimpleDateFormat sdf = new SimpleDateFormat( "yyyyy.MMMMM.dd GGG hh:mm aaa");
        String strDate = sdf.format(D);
        System.out.println( strDate );

       
       
        

   
   
   
    //     System.out.println(cal.get(cal.DATE));
    //   System.out.println(cal.getTime());


    }
}