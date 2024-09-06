// Employee 4 
public class Emp4 extends Thread {

	int n,i;
	Emp4(int n1){
		n = n1;
	}
	
// Employee 4 work in coordination with others under Project manager
	public void run() {
		// TODO Auto-generated method stub
		for (i = 1;i<=n;i++){
			{
       System.out.println("Work done by employee 4 iteration No. "+ i);
			}
		}
	}
	
// Employee 4 work not in coordination with others without Project manager		
		public void not_run_by_manager() {
			
			for (i = 1;i<=n;i++){
				{
	       System.out.println("Work done by employee 4 iteration No. "+ i);
				}
			}	
   }		
}
	

