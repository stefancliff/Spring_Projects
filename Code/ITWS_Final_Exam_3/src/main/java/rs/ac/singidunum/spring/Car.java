package rs.ac.singidunum.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	private String model;
	@Autowired
    @Qualifier("differentColours1")
	private Colour colour;
	
	public Car() {
		
	}
	
	public Car(Colour colour) {
		this.colour = colour;
	}
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Colour getColour() {
		return colour;
	}
	public void setColour(Colour colour) {
		this.colour = colour;
	}
	
	
	@Override
	public String toString() {
		return "The model is " + model + ", it is" + colour;
	}
	
	

}
