package com.SingletonLogging;

public class LoginManager {

	 private static LoginManager obj;
	private LoginManager()
	{
		
	}
   public static LoginManager getobj()
   {
	if(obj==null)
	{
		synchronized(LoginManager.class) {
			if(obj==null)
			{
				obj = new LoginManager();
			}
		}
		
	}
	return obj;
   }
   public void write(String message)
   {
	   System.out.println("Log Entry:-"+message);
   }
   public static void main(String[] args)
   {
	   LoginManager log=LoginManager.getobj();
	   log.write("First Message");
	   log.write("Second Message");
   }
}
