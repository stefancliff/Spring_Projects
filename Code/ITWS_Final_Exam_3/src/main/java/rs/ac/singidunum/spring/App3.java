package rs.ac.singidunum.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App3 {

	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		
		// Normal/standard
		
		Car car = (Car) context.getBean("car");
		System.out.println(car.toString());
		
		
		// Auto wiring byName
		
		Bike bike = (Bike) context.getBean("bike");
		System.out.println(bike.toString());
		
		
		
		
		// Auto wiring via constructor
		
		Boat boat = (Boat) context.getBean("boat");
		System.out.println(boat.toString());
		
		
		// Auto wiring annotation
		
		Truck truck = (Truck) context.getBean("truck");
		System.out.println(truck.toString());
		
		((FileSystemXmlApplicationContext)context).close();

	}

}
