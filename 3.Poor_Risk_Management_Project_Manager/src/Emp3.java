// Employee 3 
public class Emp3 extends Thread {

	int n,i;
	Emp3(int n1){
		n = n1;
	}
	
// Employee 3 work in coordination with others under Project manager	
	public void run() {
		// TODO Auto-generated method stub
		for (i = 1;i<=n;i++){
			{
       System.out.println("Work done by employee 3 iteration No. "+ i);
			}
		}
	}
	
// Employee 3 work not in coordination with others without Project manager
		public void not_run_by_manager() {
			
			for (i = 1;i<=n;i++){
				{
	       System.out.println("Work done by employee 3 iteration No. "+ i);
				}
			}	
   }		
}
	

