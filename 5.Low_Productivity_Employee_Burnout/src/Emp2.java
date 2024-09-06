// Employee 2
public class Emp2 extends Thread {

	int n;
	Emp2(int n1){
		n = n1;
	}
	
// Employee 2 task
	public void run() {
		
		for (int i = 1;i<=n;i++){
			{
       System.out.println("Work done by employee 2 iteration No. "+ i);
			}
	}
	}
}
