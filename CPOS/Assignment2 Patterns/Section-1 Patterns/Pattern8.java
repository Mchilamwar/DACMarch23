import java.util.Scanner;
class Pattern8{
	
public static void main(String args[]){	
	Scanner sc=new Scanner(System.in);
	
	int num=sc.nextInt();
	
	for(int i=num;i>=1;i--){
				
		//Space
		
		for(int k=i;k>=1;k--){
			System.out.print(" ");
		}
		

		
		// Reverse order
		for(int j=num;j>=i;j--){
			System.out.print(j+" ");
		}
		System.out.println("");
	}
}
}