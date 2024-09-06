//Employee 4
public class Emp4 extends Thread {

	int n;
	Emp4(int n1){
		n = n1;
	}

// Employee 4 task
	public void run() {
		
		for (int i = 1;i<=n;i++){
			{
       System.out.println("Work done by employee 4 interation No. "+ i);
			}
	}
	}
}
