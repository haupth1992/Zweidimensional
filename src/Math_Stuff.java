
//@author Thomas Hauptvogel

public class Math_Stuff {

	public static void main(String[] args) {
		Circle circle = new Circle(3.5f);
		Square square = new Square(4.5f);
		Rectangle rectangle = new Rectangle(3f, 4f);
		
		System.out.println("Kreisberechnung: (gerundet)");
		System.out.println("----------------");
		System.out.println("Radius: " + circle.getRadius());
		System.out.println("Umfang: " + Math.round(circle.getPerimeter()));
		System.out.println("Fläche: " + Math.round(circle.getArea()));
		System.out.println("");
		
		System.out.println("Quadratberechnung:");
		System.out.println("----------------");
		System.out.println("Länge: " + square.getLength());
		System.out.println("Umfang: " + square.getPerimeter());
		System.out.println("Fläche: " + square.getArea());
		System.out.println("");
		
		System.out.println("Rechteckberechnung:");
		System.out.println("----------------");
		System.out.println("Länge: " + rectangle.getLength());
		System.out.println("Breite: " + rectangle.getWide());
		System.out.println("Umfang: " + rectangle.getPerimeter());
		System.out.println("Fläche: " + rectangle.getArea());
		System.out.println("");
	}

}
