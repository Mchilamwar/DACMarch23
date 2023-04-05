package Question_2;

import java.util.Scanner;

class BMI_Data{
    private double Hight;
    private double Weight;
    private double BMI;

    BMI_Data(double hight,double weight){
        this.Hight=hight;
        this.Weight=weight;
    }

    public void setheight(double height){
        this.Hight=height;
    }

    public void setweight(double weight){
        this.Weight=weight;
    }

    public void CalculateBMI(){
        this.BMI=this.Weight/(this.Hight*this.Hight);

        System.out.println("BMI is "+this.BMI);
    }




}



public class BMI_Calculator {
static Scanner sc=new Scanner(System.in);
public static int menu(){
    System.out.println("1. Enter the user Hight and Wight ");
    System.out.println("2. to  ");
    System.out.println("0. Enter the user Hight and Wight ");
    return sc.nextInt();
}
public static void main(String[] args) {

    BMI_Data B=new BMI_Data(0, 0);
   
    int choice;
   
    
    while((choice=menu())!=0){

        System.out.println("1. Enter the user Hight and Wight ");
        System.out.println("2. To check BMI ");
        System.out.println("0. Enter the user Hight and Wight ");
 
        switch(choice){
            case 1:{
                System.out.println("Enter the height");
                B.setheight(sc.nextDouble());
                System.out.println("Enter the Weight");
                B.setweight(sc.nextDouble());
                break;
                }
            
            case 2:{
                B.CalculateBMI();
                break;
            }

        }

    }
    
    
}
}

    

