package com.scuba.project;


class you extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("you");
			try
			{
				Thread.sleep(1000);
				
			}
			catch (Exception e)
			{
			}
		}
	}
}
class me extends Thread
{
	public void run()
	{
		for (int i=0;i<=5;i++)
		{
			System.out.println("Me");
			try
			{
				Thread.sleep(1000);
				
			}
			catch (Exception e)
			{
			}
			
		}
	}
}
public class Threaddemo {
   public static void main(String args[])
   {
	   you obj1 = new you();
	   me obj2 = new me();
	   obj1.start();
	   obj2.start();
	   
   }
}






