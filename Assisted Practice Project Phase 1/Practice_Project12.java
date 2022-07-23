package Thread;

public class runnablethread implements Runnable{
	public static int count=0;
	public runnablethread() {
		
	}
	  public void run() {
	        while(runnablethread.count <= 10)
	        {
	            try
	            {
	                System.out.println("Expl Thread: "+(++runnablethread.count));
	                Thread.sleep(100);
	            } catch (InterruptedException iex) 
	            {
	                System.out.println("Exception in thread: "+iex.getMessage());
	            }
	        }
	  }
	  
	  public static void main(String[] args) {
		  System.out.println("Starting Main Thread...");
		  runnablethread mrt = new runnablethread();
	        Thread t = new Thread(mrt);
	        t.start();
	        while(runnablethread.count <= 10){
	            try{
	                System.out.println("Main Thread: "+(++runnablethread.count));
	                Thread.sleep(100);
	            } catch (InterruptedException iex){
	                System.out.println("Exception in main thread: "+iex.getMessage());
	            }
	}
	        
	        
}
}
