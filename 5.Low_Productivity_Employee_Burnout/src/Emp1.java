// Employee 1
public class Emp1 extends Thread {

	int n,i;
	Emp1(int n1){
		n = n1;
	}
	
// Employee 1 task
	public void run() {
		
		for (i = 1;i<=n;i++){
			{
       System.out.println("Work done by employee 1 iteration No. "+ i);
			}
		}	
   }		
}
	

