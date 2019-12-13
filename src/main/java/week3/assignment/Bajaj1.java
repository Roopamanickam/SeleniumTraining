package week3.assignment;

public class Bajaj1 extends Bike{
	
	public static void main(String[] args)
	{
		Bajaj1 objbajaj1 = new Bajaj1();
		System.out.println(objbajaj1.cost(50000));
		System.out.println(objbajaj1.Speed(50));
		
		
	}

	public String Speed(int km)
	{
		System.out.println(km);
		return "Great Mileage";
	}
}
