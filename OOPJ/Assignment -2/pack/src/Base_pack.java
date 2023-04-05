package pack.src;

public class Base_pack {
    private int num1;
    private int num2;

    public Base_pack()
    {
        this(0,0);
    }

    public Base_pack(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }

    public void sum(){
        System.out.println("Sum is = "+(this.num1+this.nm2));
    }

}
