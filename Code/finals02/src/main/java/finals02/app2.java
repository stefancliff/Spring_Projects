package finals02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class app2 {

public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("menu.xml");
		
		Menu foodMenu = (Menu) context.getBean("foodMenu");
		
		System.out.println(foodMenu);
		
		Customer sr = (Customer)context.getBean("sr");
		System.out.println(sr);
		
		Customer st = (Customer)context.getBean("st");
		System.out.println(st);
		
		Customer hn = (Customer)context.getBean("hn");
		System.out.println(hn);
		
		Customer ol = (Customer)context.getBean("ol");
		System.out.println(ol);
		
		Restaurant restaurant = (Restaurant)context.getBean("restaurant");
		System.out.println(restaurant);
		
		Reservation reservation = (Reservation)context.getBean("reservation");
		System.out.println(reservation);
		
		((FileSystemXmlApplicationContext)context).close();

	}

}
