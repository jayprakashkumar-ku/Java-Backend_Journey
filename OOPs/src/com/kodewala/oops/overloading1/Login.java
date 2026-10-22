package com.kodewala.oops.overloading1;

public class Login {
public void doLogin(String mobile,int otp) //V1
{
System.out.println("Login.doLogin(String mobile,int otp)");	

}
public String doLogin(String email,String password)//V2
{
System.out.println("Login.doLogin(String email,String password)");	
return "some value";
}
public void doLogin(String gmail)//V2
{
System.out.println("Login.doLogin(String gmail)");	
}
}
