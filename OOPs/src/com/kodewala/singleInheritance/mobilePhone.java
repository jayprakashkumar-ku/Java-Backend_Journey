package com.kodewala.singleInheritance;

public class mobilePhone {
	int ram;
	int rom;

	public void vivo() {
		System.out.println("Mobile Brand :");
		System.out.println("RAM : "+ram);
	}

	class vivoT1 extends mobilePhone {
int camera;
String processor;
@Override
		public void vivo() {
			super.vivo();
		System.out.println("camera:"+camera);
			
		}
		
	public static void main(String[] args)
	{
		vivoT1 phone = new vivoT1();
	}
	}
}
