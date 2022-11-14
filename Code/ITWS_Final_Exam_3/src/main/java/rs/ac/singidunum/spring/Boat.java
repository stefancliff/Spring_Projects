package rs.ac.singidunum.spring;


public class Boat {
	
	private String model;
	private Colour colour;
	
	public Boat() {}
	
	public Boat(Colour colour) {
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
