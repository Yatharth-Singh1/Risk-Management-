import java.util.Scanner;
public class Project_Manager  {
	
	public static void main(String[] args) {
		
		int []n = new int[4]; // to pass number of iterations to employees
		Scanner sc = new Scanner(System.in);
	
		
// Asking to hire project manager or not
		System.out.println("Would you like to hire project manager ");
		System.out.println("Y for yes N for No ");
		char ch = sc.next().charAt(0);
		if (ch=='Y') {

			
// Taking iteration input from manager
		for (int i =0; i<4;i++) {
			System.out.println ("Enter number of iterations for employee "+(i+1));
			n[i] = sc.nextInt();
		}
		
		}
		else {
	
			
// Passing random iteration input(less than 15)
			for (int i =0; i<4;i++) {
				int itr = (int)(Math.random()*(15-1+1)+1); 
				System.out.println ("Employee "+(i+1)+" gets "+itr +" iterations");
				n[i] = itr;
			}
			
		}
		
		
// Creating object of each employee
		Emp1 obj1 = new Emp1(n[0]);
		Emp2 obj2 = new Emp2(n[1]);
		Emp3 obj3 = new Emp3(n[2]);
		Emp4 obj4 = new Emp4(n[3]);
		
		
// Coordinating the work with Project manager (using threads)
		if (ch=='Y') {
			obj1.start();
			obj2.start();
			obj3.start();
			obj4.start();
		}
		
		
// Doing the work manually without any coordination
		else
		{
			obj1.not_run_by_manager();
			obj2.not_run_by_manager();
			obj3.not_run_by_manager();
			obj4.not_run_by_manager();
		}
		sc.close();
		
	}

}
