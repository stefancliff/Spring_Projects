package rs.ac.singidunum.spring;

public class Colour {
	
	private String texture;
	private String colourHue;
	
	
	public String getTexture() {
		return texture;
	}
	public void setTexture(String texture) {
		this.texture = texture;
	}
	public String getColourHue() {
		return colourHue;
	}
	public void setColourHue(String colourHue) {
		this.colourHue = colourHue;
	}
	
	
	@Override
	public String toString() {
		return " " + texture + " in texture and it's colour hue is: " + colourHue + ".";
	}

}
