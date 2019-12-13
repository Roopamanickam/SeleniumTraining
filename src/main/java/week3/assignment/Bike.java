package week3.assignment;

public abstract class Bike {
	
	public String cost(int price)
	{
		System.out.println(price);
		return "Best Price";
	}
	
	public abstract String Speed(int km);
	
}
