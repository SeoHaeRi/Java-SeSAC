package java_first_project;

public class Car extends Vehicle {
	private boolean suntan;
	private String handDrive;
	
	public Car(String name, int wheel, String color, int passengers) {
		super(name,wheel,color,passengers);
	}

	public boolean isSuntan() {
		return suntan;
	}

	public void setSuntan(boolean suntan) {
		this.suntan = suntan;
	}

	public String getHandDrive() {
		return handDrive;
	}

	public void setHandDrive(String handDrive) {
		this.handDrive = handDrive;
	}
	
	
}
