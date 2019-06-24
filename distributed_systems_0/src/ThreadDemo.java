
import java.lang.Thread;
import java.lang.Exception;

	

	public class ThreadDemo extends Thread
	{
		private String threadName;
				
		ThreadDemo()
		{
			
		}
		
		ThreadDemo(String name)
		{
			threadName = name;
		}
		
		public void setThreadName(String name)
		{
			this.threadName = name;
		}
		
		public String getThreadName()
		{
			return this.threadName;
		}
		
		public void StartServer()
		{
			InetAddres getByAddres(byte[] addr);
			byte[] addr = {127.0.0.1};
			
		}
		
		public void run()
		{
			try
			{
				
				
				
			}catch (Exception e)
			{
				System.out.println("Times out");
			}
		}
		
	}
	

