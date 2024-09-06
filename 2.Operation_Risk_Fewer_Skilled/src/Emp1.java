// Employee 1
public class Emp1 {

	int n,i,n0;
	Emp1(int n1,int n2){
		n = n1;
		n0 = n2;
	}
	
// Employee 1 normal task
		public void task() {
		
			for (i = 1;i<=n;i++){
				{
	       System.out.println("Task by employee 1 iteration No. "+ i);
				}
			}	
   }	
	
// Employee 1 special task
			public void Special() {
			for (i = 1;i<=n0;i++){
				{
	       System.out.println("Special Task performed by employee 1 iteration No. "+ i);
				}
			}
		}
}
	

