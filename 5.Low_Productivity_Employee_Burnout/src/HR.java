import java.util.*;

// HR to handle all the employees
public class HR extends Emp3 {
	int emp3var;
	HR(int n){
		emp3var = n;
	}
	
// Function for employee 3 to work and leave in mid
	public void run() {
		int random = (int)(Math.random()*(emp3var-1+1)+1);
		for (int i =1; i<random;i++) {
			System.out.println("Work done by employee 3 iteration No. "+ i);
		}
		System.out.println("");
		System.out.println("Employee 3 left ");
		System.out.println("");
	}

	public static void main(String[] args) {
		int []n = new int[4]; // to pass iterations to employees
		Scanner sc = new Scanner(System.in);
		
		
// Asking for manual or system distribution of work
		System.out.println("Would you like to divide the work manually or by system ");
		System.out.println("M for manual S for system ");
		char ch = sc.next().charAt(0);
		
		if (ch=='M') {
		for (int i =0; i<4;i++) 
		{


// Taking manual iterations
			System.out.println ("Enter number of iterations for employee "+(i+1));
			n[i] = sc.nextInt();
		}}
		else 
		{
			for (int i =0; i<4;i++)
			{
				
				
// Passing random iterations 
				int itr = (int)(Math.random()*(15-1+1)+1); 
				System.out.println ("Employee "+(i+1)+" gets "+itr +" iterations");
				n[i] = itr;
			}
			
		}
		
		
// Creating object of all employees
		Emp1 obj1 = new Emp1(n[0]);
		Emp2 obj2 = new Emp2(n[1]);
		Emp4 obj3 = new Emp4(n[3]);
		HR obj = new HR(n[2]);
		
		
// Asking employees to work
		obj1.start();
		obj2.start();
		obj3.start();
		obj.start();
		
		
		sc.close();
		
	}

}
