package finals02;

import java.util.HashMap;
import java.util.Map;

public class Reservation {
	
	private Map<String, String> meals = new HashMap<String, String>();
	private Map<String, Customer> customers = new HashMap<String, Customer>();
	
	public void setMeals(Map<String, String> meals) {
		this.meals = meals;
	}
	
	public void setCustomers(Map<String, Customer> customers) {
		this.customers = customers;
	}
	
	public String toString(){
		
		StringBuilder sb = new StringBuilder();
		
		for (Map.Entry<String, String> entry: meals.entrySet()){
			sb.append(entry.getKey() + ": " + entry.getValue() + "\n");
		}
		
		for (Map.Entry<String, Customer> entry: customers.entrySet()){
			sb.append(entry.getKey() + ": " + entry.getValue() + "\n");
		}
		
		return sb.toString();
	}

}
