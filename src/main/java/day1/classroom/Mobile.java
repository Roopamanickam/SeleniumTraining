package day1.classroom;

public class Mobile {
	
	public String makecall(int phonenum) {
		//System.out.println("inside makecall");
		return "Call connected";
			
	}
	
	public String sendSMS(String sms) {
		System.out.println("inside sendSMS");
		return "sms sent successfully";
			
	}

	public boolean shutDown() {
		System.out.println(" shutDown successfully");
		return true;
			
	}

public static void main (String[] args) {
	Mobile mob = new Mobile();
	
	 String makecall = mob.makecall(999999999);
			System.out.println(makecall);
		
		String txt = mob.sendSMS("hi How are you");
		System.out.println(txt);
		
		mob.shutDown();
}

}