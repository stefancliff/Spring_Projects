package finals02;

public class Customer {

	private String customerName;
	private int age;
	private int customerId;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	@Override
	public String toString() {
		return "Customer [customerName = " + customerName + ", age = " + age + ", customerId = " + customerId + "]";
	}
	
	
	
	
	
	
	
}
