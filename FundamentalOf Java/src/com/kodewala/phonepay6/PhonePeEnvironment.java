package com.kodewala.phonepay6;

public class PhonePeEnvironment {
public static void main(String[] args) {
	
	//java runtime version
	String version = System.getProperty("java.version");
	
	//Operating System ka naam
	//String os=System.clearProperty(os.version);
	String os_version = System.getProperty("os.name");
	
	
	
	System.out.println("Runtime Version : "+ version);
	//System.out.println("Operating System: "+os);
	System.out.println("Operating System: "+os_version);
	
}
}
