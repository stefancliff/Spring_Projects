package rs.ac.singidunum.spring;

public class User {
	
	private String username;
	private String message;
	private String ipAddressMask;
	
	private PC pc;
	
	public User() {
		
	}
	
	public User(String message, String username) {
		this.message = message;
		this.username = username;
	}
	
	public void setPC(PC pc) {
		this.pc = pc;
	}
	
	public void setIpAddressMask(String ipAddressMask) {
		this.ipAddressMask = ipAddressMask;
	}
	
	public void sendMessage() {
		
		System.out.println("Hi guys, I am " + this.username + " and I am looking forward to working with you all! \nMy message is: " + this.message + "\n");
	
	}

	@Override
	public String toString() {
		return "User [username = " + username + ", message = " + message + ", ipAddressMask = " + ipAddressMask + ", pc = " + pc
				+ "] \n";
	}
	
	
	public void onCreate() {
		System.out.println("User online: " + this);
	}
	
	public void onDestroy() {
		System.out.println("User offline: " + this);
	}
	

}
