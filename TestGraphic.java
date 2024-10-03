package interfacepack;

public class TestGraphic {

	public static void main(String[] args) {
		Circle circle = new Circle(7.9f);
		Rectangle rectangle = new Rectangle(10.5f, 20.3f);
		System.out.println("Area of circle is        : " + circle.area());
		System.out.println("Perimeter of circle is   : " + circle.perimeter());
		System.out.println("-----------------------------------");
		System.out.println("Area of Rectangle is     : " + rectangle.area());
		System.out.println("Perimeter of rectangle is: " + rectangle.perimeter());

	}

}
