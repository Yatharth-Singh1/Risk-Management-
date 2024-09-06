import java.util.Scanner;
public class Operational_Manager{
	
	public static void main(String[] args) {
		int []n = new int[4];// For passing number of iterations of normal task
		int []n1 = new int[4];// For passing number of iterations of special task
		Scanner sc = new Scanner(System.in);
		
// Asking for manual or system work distribution
		System.out.println("Would you like to divide the work Manually or by System ");
		System.out.println("M for manual S for system ");
		char ch = sc.next().charAt(0);
		
		
		if (ch=='M') {
		for (int i =0; i<4;i++) 
		{
// Taking iterations from user in case of manual
			System.out.println ("Enter number of iterations for employee for Normal task "+(i+1));
			n[i] = sc.nextInt();
			System.out.println ("Enter number of iterations for employee for Special task "+(i+1));
			n1[i] = sc.nextInt();
		}
		
		}
		else
		{

// Passing iterations from System {Normal(max 8) Special (max4)}
			for (int i =0; i<4;i++) {
				int itr = (int)(Math.random()*(8-1+1)+1); 
				System.out.println ("Employee "+(i+1)+" gets "+itr +" Normal iterations");
				n[i] = itr;
				itr = (int)(Math.random()*(4-1+1)+1); 
				System.out.println ("Employee "+(i+1)+" gets "+itr +" Special iterations");
				n1[i] = itr;
				
			}
			
		}

		
// Creating objects for employees
		Emp1 obj1 = new Emp1(n[0],n1[0]);
		Emp2 obj2 = new Emp2(n[1],n1[1]);
		Emp3 obj3 = new Emp3(n[2],n1[2]);
		Emp4 obj4 = new Emp4(n[3],n1[3]);
		
		
//Asking employees to perform Normal task	
		obj1.task();
		obj2.task();
		obj3.task();
		obj4.task();
		
		
//Asking employees to perform Special task			
		obj1.Special();
		obj2.Special();
		obj3.Special();
		obj4.Special();
		
		sc.close();
		
	}

}
