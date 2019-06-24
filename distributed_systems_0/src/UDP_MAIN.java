
import java.lang.Thread;

public class UDP_MAIN {

	
	public static void main(String args[]) throws Exception
	{
		String Thread_One = "Teste1";
		String Thread_Two = "Verdadeiro";
		Thread t = new ThreadDemo(Thread_One);
		Thread t1 = new ThreadDemo(Thread_Two);
		t.start();
		
		
	}
	
	
}
