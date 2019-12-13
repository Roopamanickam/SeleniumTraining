package week3.classroom;

public class Redmi extends Mobile {
	

	public String Model(String modelname)
	{
		//String name="Red Me Note 5";
		return modelname;
	}

	public String Model(String batterytype ,String modelname)
	{
		String detail= batterytype+modelname;
		return detail;
	}
	public int Camera()
	{
		int pixel=40;
		return pixel;
	}
	
	
}
