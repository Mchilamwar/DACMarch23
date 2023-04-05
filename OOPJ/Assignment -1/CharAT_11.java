public class CharAT_11 {

    public static void main(String[] args) {
        char ch=args[0].charAt(0);

        // Character ch2=Character.valueOf(ch);

        if(Character.isDigit(ch))
        {
            System.out.println("Value of Degit is "+Character.getNumericValue(ch)+" code point is "+args[0].codePointAt(0));

        }

        else
        {
            if(Character.isLowerCase(ch))
            {   
                char arr[]=new char[] {Character.toUpperCase(ch)};
                System.out.println("Uppercase is "+arr[0]+" Code Point is "+Character.codePointAt(arr, 0));
            }
            else{
                char arr[]=new char[] {Character.toLowerCase(ch)};
                System.out.println("Uppercase is "+arr[0]+" Code Point is "+Character.codePointAt(arr, 0));
            }
        }



    }


    
}
