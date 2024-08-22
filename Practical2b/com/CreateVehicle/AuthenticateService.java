package com.CreateVehicle;

public class AuthenticateService {
  private static AuthenticateService obj;
  private String LogInUser;
  private AuthenticateService()
  {
  }
     public static synchronized AuthenticateService getobj()
     {
    	 if(obj==null)
    	 {
    		 obj = new AuthenticateService();
    	 }
		return obj;  	 
     }
     public void Login(String user)
     {
    	 this.LogInUser=user;
    	 System.out.println("USER:"+ user +" has login successfully");
     }
     public void Logout()
     {
    	 System.out.println("User:"+obj+"has Logged Out Successfully");
    	 this.obj=null;
     }
     public AuthenticateService getLoggedInUser() {
         return obj;
     }
     
}
