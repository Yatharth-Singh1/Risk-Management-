
// Employee 1 

public class Emp1 extends Thread {

	int n,i;
	Emp1(int n1){
		n = n1;
	}

// Employee 1 work in coordination with others under Project manager
	public void run() {
		// TODO Auto-generated method stub
		for (i = 1;i<=n;i++){
			{
       System.out.println("Work done by employee 1 iteration No. "+ i);
			}
		}
	}
// Employee 1 work not in coordination with others without Project manager
		public void not_run_by_manager() {
			
			for (i = 1;i<=n;i++){
				{
	       System.out.println("Work done by employee 1 iteration No. "+ i);
				}
			}	
   }		
}
	

