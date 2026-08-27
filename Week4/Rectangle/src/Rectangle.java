public class Rectangle {
	private double width;
	private double height;

	public Rectangle() {
		this(1, 1);
		System.out.println("Rectangle(): 1 by 1 rectangle");
	}

	public Rectangle(double side) {
		this(side, side);
		System.out.println("Rectangle(double): square with side " + side);
	}

	public Rectangle(double width, double height) {
		if (width <= 0 || height <= 0) {
			throw new IllegalArgumentException("Width and height must be positive.");
		}

		this.width = width;
		this.height = height;
		System.out.println("Rectangle(double, double): " + width + " by " + height + " rectangle");
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return 2 * (width + height);
	}

	public boolean isSquare() {
		return width == height;
	}

	public void scale(double factor) {
		if (factor <= 0) {
			throw new IllegalArgumentException("Scale factor must be positive.");
		}

		width *= factor;
		height *= factor;
	}

	@Override
	public String toString() {
		return "Rectangle{" + "width=" + width + ", height=" + height + '}';
	}
}
