package finals02;

import java.util.List;

public class Restaurant {
	
	private Customer oldest;
	private List<Customer> customers;
	
	public Customer getOldest() {
		return oldest;
	}
	public void setOldest(Customer oldest) {
		this.oldest = oldest;
	}
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Oldest: " + oldest);
		sb.append("\n");
		sb.append("Other customers in the Restaurant: \n");
		for (Customer customer: customers){
		sb.append(customer);
		sb.append("\n");
		}
		return sb.toString();
		}
	
	

}
