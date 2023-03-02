package java_first_project;

public class Rectangle {
	private int width, height;
	public static int count = 0;
	
	public Rectangle(int width) {
		this.width = width;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int area() {
		count++;
		return this.width * this.height;
	}
}
