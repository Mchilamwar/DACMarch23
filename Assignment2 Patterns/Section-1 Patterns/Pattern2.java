import java.util.Scanner;
class Pattern2{
	
public static void main(String args[]){	
	Scanner sc=new Scanner(System.in);
	
	int num=sc.nextInt();
	
	for(int i=65;i<=(65+num);i++){
		for (int j=65;j<=i;j++){
		System.out.printf("%c ",j);
		}
		System.out.println("");
	}
}
}