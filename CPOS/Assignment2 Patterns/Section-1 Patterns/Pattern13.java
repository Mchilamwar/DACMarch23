import java.util.Scanner;
class Pattern13{
	
public static void main(String args[]){	
	Scanner sc=new Scanner(System.in);
	
	int num=sc.nextInt();
	
	for(int i=65;i<=(65+num);i++){
		
		for(int k=(65+num);k>=i;k--){
			System.out.print(" ");
		}
		
		
		for(int j=65;j<=i;j++){
			System.out.printf("%c ",i);
		}
		System.out.println("");
	}
}
}