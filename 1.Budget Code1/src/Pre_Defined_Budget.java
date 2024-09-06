import java.util.Scanner;
public class Pre_Defined_Budget {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		
// Enter the Budget decided by the client
		System.out.println("Enter the predefined budget passed by the client for the project ");
		n = sc.nextInt();
		
		
// Enter the budget decided by the developers team
		System.out.println("Enter the new budget at the start of the project by developers team ");
		int bug0 = sc.nextInt();
		if (n>=bug0)
		{
			
// Start of the project
			System.out.println("Project started ");
			
			while(true) {
				int run = (int)(Math.random()*(10-1+1)+1); 
				for(int j=0;j<=run;j++) 
					
// Project work is being done			
				{	
				System.out.println("Number of iterations completed "+j);
				}
				
				
// Checking the progress of the project
				System.out.println("Is the project completed ");
				System.out.println("Y for yes N for no ");
				char ch =  sc.next().charAt(0);
				if (ch=='Y')
					{
					System.out.println("Project successfully completed ");
					System.out.println("Thank you");
					break;
					}
		
				
// Re-checking the budget after completing some part is completed
				
				System.out.println("Time to recheck the budget ");
				System.out.println("Enter new budget ");
				bug0 = sc.nextInt();
				if (n<bug0)
				
// Project stopped due to budget issues.
				{
					System.out.println("Project could not be completed due to budget issues");
					break;
				}
			}
			
		}
		
// Project cancelled due to budget issues
		
		
		else {
			System.out.println("Project cannot be started due to budget issue ");
		}
		sc.close();
	}

}
