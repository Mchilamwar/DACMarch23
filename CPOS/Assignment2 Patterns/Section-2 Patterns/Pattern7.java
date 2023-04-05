import java.util.Scanner;
class Pattern7{
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();

			for(int i=1;i<=num;i++){
			
			for(int k=num;k>i;k--){
				System.out.print("  ");
			}
			
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			
			for(int l=1;l<=i-1;l++){
				System.out.print("*");
			}
			
			
			System.out.println("");
		}
		
		
		//----------------
		for(int i=1;i<=num;i++){
			
			for(int k=1;k<i;k++){
			System.out.print("  ");
			}
			
			for (int j=num;j>=i;j--){
				System.out.print("*");
			}
			for(int l=num-1;l>=i;l--){
				System.out.print("*");
			}
			
			System.out.println("");
		}
		}
		}