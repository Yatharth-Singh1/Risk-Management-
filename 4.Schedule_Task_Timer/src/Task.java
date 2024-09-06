import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Task {
static int interval; // Actual variable to run timer
static int Client_time; // Client's Time
static int dev_time; // Developers' Time
static Timer timer;

Task(int interval_by_user,int dev_timebyuser){
	interval = interval_by_user;
	Client_time = interval; 
	dev_time = dev_timebyuser;
}

public void main() {
    Scanner sc = new Scanner(System.in);
    timer = new Timer();
    System.out.println(interval);
    timer.scheduleAtFixedRate(new TimerTask() {

// Over-riding the run function in timer to perform our task in the fixed time (1 second)
        public void run() {
        	setInterval();
        	if (interval!=0)
        	System.out.println(interval);

        }
    }, 1000, 1000);
    sc.close();
}


// Stop the timer when interval becomes 1 and also check for developers time>Client time
public void setInterval() {
    if (interval == 1) {
        timer.cancel();
        if (dev_time > Client_time) {
        System.out.println("Developers time "+dev_time +" Clients' time "+ Client_time );	
        System.out.println("Task failed by "+(dev_time - Client_time  )+ " Seconds");
       
        }
        else
        	System.out.println("Task completed successfully as developers were able to meet the client's deadlines  ");
    }
    interval--;
}
}