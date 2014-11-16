
public class Rectangle implements TwoDimensional{
	
	private float length;
	private float wide;
	
	public Rectangle(float length, float wide){
		this.setLength(length);
		this.setWide(wide);
	}

	public double getPerimeter() {
		return (2 * this.getLength() + 2 * this.getWide());
	}

	public double getArea() {
		return (this.getLength() * this.getWide());
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWide() {
		return wide;
	}

	public void setWide(float wide) {
		this.wide = wide;
	}

}
