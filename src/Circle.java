
public class Circle implements TwoDimensional{
	
	private float radius;
	
	public Circle(float radius){
		this.setRadius(radius);
	}

	public double getPerimeter() {
		return (2 * TwoDimensional.pi * this.getRadius());
	}

	public double getArea() {
		return (TwoDimensional.pi * (this.getRadius() * this.getRadius()));
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

}
