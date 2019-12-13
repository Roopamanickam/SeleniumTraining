package week3.classroom;

public class MyMobile extends Redmi {
	
	public int Camera()
	{
		int pixel=120;
		return pixel;
	}
	public static void main(String[] args) 
	{
		MyMobile myPhone = new MyMobile();
		String inhert = myPhone.call();
		System.out.println("Inheritance: "+inhert);
		String overlod = myPhone.Model("REdmi Note 5 Plus");
		System.out.println("overloding: "+overlod);
		String overrid = myPhone.Model("inbuit", "Redmi note 3");
		System.out.println("Overridding: "+overrid);
		
		myPhone.Camera();
		
	}

}
