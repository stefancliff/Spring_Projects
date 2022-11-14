package rs.ac.singidunum.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Server_App1 {
	
	public static void main(String[] args) {
	
	ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
	
	User user1 = (User) context.getBean("user1");
	User user2 = (User) context.getBean("user2");
	
	PC pc1 = (PC) context.getBean("pc1");
	PC pc2 = (PC) context.getBean("pc2");
	
	pc1.connectToServer();
	user1.sendMessage();
	
	pc2.connectToServer();
	user2.sendMessage();
	
	((FileSystemXmlApplicationContext)context).close();
	
	}
}
