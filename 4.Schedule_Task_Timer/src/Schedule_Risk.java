import java.util.*;
public class Schedule_Risk {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
// Asking deadline from client
		System.out.println("Enter the deadline selected by client ");
		int timer_by_client = sc.nextInt();
		
// Deadline decided by developers team 
		System.out.println("Enter the deadline selected by developers team ");
		int timer_by_developers = sc.nextInt();
		
		if (timer_by_developers>timer_by_client) {
			System.out.println("Would you like to negotiate");
			System.out.println("Y for yes N for no");
			char ch = sc.next().charAt(0);
			if (ch=='Y')
				System.out.println("Enter new Negotiable time");
				timer_by_client = sc.nextInt();
		}
		
// Creating object of project class and starting the project
		Task obj = new Task(timer_by_client,timer_by_developers);
		obj.main();
		
		sc.close();

	}

}
