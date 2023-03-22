class Hollow_Invert{

public static void main(String args[]){
	
	for(int i=6;i>=1;i--){
		
		for(int j=1;j<=i;j++){
			
			if(i!=6){	
				
				if(j==1||j==i)
					System.out.print("* ");
				
				else
					System.out.print("  ");
			}		
			
			else
				System.out.print("* ");
		}
		System.out.println("");
		
		
	}
	
	
	
	
	
}


}