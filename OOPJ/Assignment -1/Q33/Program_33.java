class Program_33 {

    public static boolean isInteger(String s)
    {
        try{
            Integer.parseInt(s);
            return true;
        }
        catch (Exception e){
        return false;
        }
    }

    public static boolean isFloat(String s)
    {
        try{
            Float.parseFloat(s);
            return true;
        }
        catch (Exception e){
        return false;
        }
    }

    public static boolean isDouble(String s)
    {
        try{
            Double.parseDouble(s);
            return true;
        }
        catch (Exception e){
        return false;
        }
    }





    public static void main(String[] args) {
        
        double sum=0.0;

        for (int i=0;i<args.length;i++){

            if (isInteger(args[i])){
                sum+=(double)(Integer.parseInt(args[i]));
            }

            else if(isFloat(args[i])){
                sum+=(double)(Float.parseFloat(args[i]));
            }

            else if(isDouble(args[i])){
                sum+=(double)(Double.parseDouble(args[i]));
            }

            
        }

        System.out.println("The Sum is : "+sum);


    }   
    
}
