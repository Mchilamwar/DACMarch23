import java.util.Scanner;
class Pattern10{
	
public static void main(String args[]){	
	Scanner sc=new Scanner(System.in);
	
	int num=sc.nextInt();
	
	for(int i=(65+num);i>=65;i--){
				
		//Space
		
		for(int k=i;k>=65;k--){
			System.out.print(" ");
		}
		

		
		// Reverse order
		for(int j=(65+num);j>=i;j--){
			System.out.printf("%c ",j);
		}
		System.out.println("");
	}
}
}