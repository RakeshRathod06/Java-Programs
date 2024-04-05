package junit;

public class Apple {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean checkColor() {
		if (color.equals("Red") || color.equals("Green"))
			return true;
		else
			return false;

	}
}
