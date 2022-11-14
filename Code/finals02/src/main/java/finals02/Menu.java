package finals02;

import java.util.List;

public class Menu {
	
	private String name;
	private int price;
	private List<String> meals;
	
	public Menu() {
		
	}
	
	public Menu(String name, List<String> meals) {
	
		this.name = name;
		this.meals = meals;
	}
	
	public Menu(String name, int price, List<String> meals) {
		
		this.name = name;
		this.price = price;
		this.meals = meals;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		
		sb.append(name);
		sb.append(" contains:\n");
		
		for (String meal: meals){
			sb.append(meal);
			sb.append("\n");
		}
		
		return sb.toString();
	}

	
	
	
	
	

}
