package rs.ac.singidunum.spring;

public class PC {
	
	private String ipAddress;
	
	public PC (){
		
	}
	
	public PC (String ipAddress){
		
		this.ipAddress = ipAddress;
	}
	
	
	public void connectToServer() {
		
		System.out.println("Connecting to server from the ip address: " + this.ipAddress);
	}

}
