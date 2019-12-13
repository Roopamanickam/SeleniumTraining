package week3.assignment;

public class Desktop implements Software,HardWare {
	
	public static void main(String[] args)
	{
		Desktop desk = new Desktop();
		desk.desktopModel();
	
		desk.Java("Automation");
		desk.JVersion(1.9f);
		String stg = desk.cpu(3.16f);
		//System.out.println(stg);
		System.out.println(desk.cpu(3.16f));
		desk.memory("1 GB");
	}

	public String Java(String Sel)
	{
		
		
		return "Java Success";
	}
	
	public float JVersion(float Javaver)
	{
		System.out.println("latest version in(SOP)"+Javaver);
		return Javaver;
	}
	
	public String cpu(float Ghz)
	{
		System.out.println(Ghz);
		String  Ghzs = "Great Memory"; 
		return Ghzs;
	}
	public String memory(String space)
	{
		String mem = "1 GB";
		return mem;
	}
	public void desktopModel()
	{
		String modelNo = "7.89";
	}
}
