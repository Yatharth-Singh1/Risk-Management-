
// Employee 2

public class Emp2 extends Thread {

	int n,i;
	Emp2(int n1){
		n = n1;
	}
	
// Employee 2 work in coordination with others under Project manager
	
	public void run() {
		// TODO Auto-generated method stub
		for (i = 1;i<=n;i++){
			{
       System.out.println("Work done by employee 2 iteration No. "+ i);
			}
		}
	}
	
// Employee 2 work not in coordination with others without Project manager	
		public void not_run_by_manager() {
			
			for (i = 1;i<=n;i++){
				{
	       System.out.println("Work done by employee 2 iteration No. "+ i);
				}
			}	
   }		
}
	

