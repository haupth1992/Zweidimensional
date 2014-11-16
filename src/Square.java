
public class Square implements TwoDimensional{
	
	private float length_a;
	
	public Square(float length){
		this.setLength(length);
	}

	public double getPerimeter() {
		return (4 * this.getLength());
	}

	public double getArea() {
		return (this.getLength() * this.getLength());
	}

	public float getLength() {
		return length_a;
	}

	public void setLength(float length_a) {
		this.length_a = length_a;
	}
	

}
