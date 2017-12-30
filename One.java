
public class One implements Runnable
{


	public static void main(String[] args) 
	{
		One r1=new One();
		One r2=new One();
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);

		System.out.println("t1:"+t1.getName());
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		System.out.println(t1.getPriority()+"\n"+t2.getPriority());
	}

	@Override
	public void run() 
	{	
		System.out.println("thread");
	}

}
